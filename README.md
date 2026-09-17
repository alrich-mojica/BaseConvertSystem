# BaseConvertSystem

A desktop Java application for converting numbers between **Decimal, Binary, Hexadecimal, and Octal**, with a built-in calculator that performs arithmetic and displays the result in all four number systems at once.

Built with **Java Swing** and **Maven**.

---

## Overview

BaseConvertSystem is a GUI tool for working with numeral systems. It's split into two windows that you can switch between with a single click:

- **Converter** – enter a number in one base and instantly see it converted into the other three.
- **Calculator** – enter two numbers in the same base, choose an operation, and get the result displayed simultaneously in Decimal, Binary, Hexadecimal, and Octal.

## Features

- 🔄 **Base Converter** — convert a number from Decimal, Binary, Hexadecimal, or Octal into the remaining three bases.
- 🧮 **Base Calculator** — perform `+`, `-`, `*`, `/` on two numbers entered in the same base, with the result shown across all four bases simultaneously.
- 🔀 **Switchable windows** — jump between the Converter and Calculator views without restarting the app.
- ✅ **Input validation** — each base has its own validation pattern (e.g. only `0-1` for Binary, `0-7` for Octal, `0-9A-F` for Hexadecimal); invalid input highlights the field in red instead of crashing.
- ➖ **Negative number support** in the converter's binary conversion logic.

## Tech Stack

- **Java** (compiled with `maven.compiler.release` 23)
- **Swing / AWT** for the GUI
- **Maven** for build and dependency management

## Project Structure

```
BaseConvertSystem/
├── pom.xml
└── src/main/java/com/mycompany/baseconvertsystem/
    ├── Main.java                # Entry point; wires up UI event listeners
    ├── ConverterFrame.java      # Converter window (Swing UI)
    ├── CalculatorFrame.java     # Calculator window (Swing UI)
    ├── Convertion.java          # Common interface for all converters
    ├── Calculate.java           # Arithmetic operations (+, -, *, /)
    ├── DecimalConvertion.java   # Orchestrates conversion from Decimal input
    ├── BinaryConvertion.java    # Orchestrates conversion from Binary input
    ├── HexaConvertion.java      # Orchestrates conversion from Hexadecimal input
    ├── OctalConvertion.java     # Orchestrates conversion from Octal input
    ├── DecimalToBinary.java
    ├── DecimalToHexa.java
    ├── DecimalToOctal.java
    ├── BinaryToDecimal.java
    ├── HexaToDecimal.java
    └── OctalToDecimal.java
```

Each base-to-base conversion (e.g. `DecimalToBinary`, `HexaToDecimal`) is implemented as its own class through the shared `Convertion` interface, keeping the conversion logic decoupled from the UI.

## How It Works

1. **Main.java** creates both the `ConverterFrame` and `CalculatorFrame`, then attaches mouse listeners to:
   - the buttons that toggle visibility between the two windows, and
   - the "Convert" buttons that trigger the conversion/calculation logic.
2. In the **Converter**, the selected source base determines which `*Convertion` class (`DecimalConvertion`, `BinaryConvertion`, `HexaConvertion`, `OctalConvertion`) handles the request; that class validates the input and calls the appropriate `*To*` converter classes to populate the result fields.
3. In the **Calculator**, the input in each field is validated against the selected base, converted to Decimal, run through `Calculate.sum()` with the chosen operator, and then converted back into Decimal, Binary, Hexadecimal, and Octal for display.

## Getting Started

### Prerequisites

- JDK 23 (or a compatible version, per `pom.xml`)
- Maven

### Build

```bash
mvn clean package
```

### Run

```bash
java -jar target/BaseConvertSystem-1.0-SNAPSHOT.jar
```

Or run `Main.java` directly from your IDE (e.g. NetBeans, IntelliJ IDEA, or VS Code with the Java Extension Pack).

## Usage

1. Launch the app — the **Converter** window opens by default.
2. Select the base of your input number and type it in.
3. The equivalent values in the other three bases appear automatically.
4. Click the button to switch to the **Calculator** window.
5. Select a base, enter two numbers, choose an operator, and view the result in all four bases.

## About This Project

This project was built in 2024 as part of my second-year coursework to practice Java, object-oriented design, and building GUI applications with Swing.

Development Note: This project was implemented independently, without AI-assisted code generation.

## License

No license specified.
