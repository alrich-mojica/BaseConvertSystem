package com.mycompany.baseconvertsystem;

import java.awt.Color;
import java.awt.event.*;
//import java.awt.event.MouseEvent;
public class Main {
    public static void main(String[] args) {
        ConverterFrame converter = new ConverterFrame();
        CalculatorFrame calculator = new CalculatorFrame();

        converter.calculatorBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            calculator.setVisible(true);
            converter.setVisible(false);
            }
        });

        calculator.converterBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            calculator.setVisible(false);
            converter.setVisible(true);
            }
        });

        converter.convertBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Convertion convert = null;
                String comboBox1 = (String) converter.comboBox1.getSelectedItem();
                if( converter.userInput.getText().isBlank()) {
                    converter.userInput.setBackground(Color.red);
                } else {
                    converter.userInput.setBackground(Color.white);
                    if(comboBox1=="Decimal") {			
                        new DecimalConvertion(converter, convert);
                    } else if (comboBox1=="Binary") {
                        new BinaryConvertion(converter, convert);
                    } else if (comboBox1=="Hexa") {
                        new HexaConvertion(converter, convert);
                    } else if (comboBox1=="Octal") {
                        new OctalConvertion(converter, convert);
                    } else {
                        System.out.println("Invalid!");
                    }
                }
            }
        });
		  
        calculator.convertBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Convertion convert = null;
                Calculate calcu = new Calculate();
                String comboBox = (String) calculator.comboBox.getSelectedItem();

                if(comboBox=="Decimal") {			
                    if(calculator.num1.getText().matches("^-?[0-9]+$") && calculator.num2.getText().matches("^-?[0-9]+$")) {
                        int num1 = Integer.parseInt(calculator.num1.getText());
                        int num2 = Integer.parseInt(calculator.num2.getText());
                        String operator = (String) calculator.operators.getSelectedItem();
                        int sum = calcu.sum(num1, num2, operator);

                        calculator.result1.setText(Integer.toString(sum));
                        convert = new DecimalToBinary();
                        StringBuilder reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result2.setText(reversed.reverse().toString());
                        convert = new DecimalToHexa();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result3.setText(reversed.reverse().toString());
                        convert = new DecimalToOctal();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result4.setText(reversed.reverse().toString());
                    } else { System.out.println("inva");}
                } else if (comboBox=="Binary") {
                    if(calculator.num1.getText().matches("^-?[01]+$") && calculator.num2.getText().matches("^-?[01]+$")) {
                        convert = new BinaryToDecimal();
                        int num1 = Integer.parseInt(convert.convert(calculator.num1.getText()));
                        convert = new BinaryToDecimal();
                        int num2 = Integer.parseInt(convert.convert(calculator.num2.getText()));
                        String operator = (String) calculator.operators.getSelectedItem();
                        int sum = calcu.sum(num1, num2, operator);

                        convert = new DecimalToBinary();
                        StringBuilder reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result1.setText(reversed.reverse().toString());
                        calculator.result2.setText(Integer.toString(sum));
                        convert = new DecimalToHexa();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result3.setText(reversed.reverse().toString());
                        convert = new DecimalToOctal();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result4.setText(reversed.reverse().toString());
                    } else { System.out.println("inva"); }
                } else if (comboBox=="Hexa") {
                    if(calculator.num1.getText().toUpperCase().matches("^-?[0-9A-F]+$") && calculator.num2.getText().toUpperCase().matches("^-?[0-9A-F]+$")) {
                        convert = new HexaToDecimal();
                        int num1 = Integer.parseInt(convert.convert(calculator.num1.getText()));
                        convert = new HexaToDecimal();
                        int num2 = Integer.parseInt(convert.convert(calculator.num2.getText()));
                        String operator = (String) calculator.operators.getSelectedItem();
                        int sum = calcu.sum(num1, num2, operator);
                        convert = new DecimalToHexa();
                        StringBuilder reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result1.setText(reversed.reverse().toString());
                        calculator.result2.setText(Integer.toString(sum));
                        convert = new DecimalToBinary();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum))); 
                        calculator.result3.setText(reversed.reverse().toString());
                        convert = new DecimalToOctal();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result4.setText(reversed.reverse().toString());
                    } else { System.out.println("inva"); }
                } else if (comboBox=="Octal") {
                    if(calculator.num1.getText().matches("^-?[0-7]+$") && calculator.num2.getText().matches("^-?[0-7]+$")) {
                        convert = new OctalToDecimal();
                        int num1 = Integer.parseInt(convert.convert(calculator.num1.getText()));
                        convert = new OctalToDecimal();
                        int num2 = Integer.parseInt(convert.convert(calculator.num2.getText()));
                        String operator = (String) calculator.operators.getSelectedItem();
                        int sum = calcu.sum(num1, num2, operator);
                        convert = new DecimalToOctal();
                        StringBuilder reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result1.setText(reversed.reverse().toString());
                        calculator.result2.setText(Integer.toString(sum));
                        convert = new DecimalToBinary();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result3.setText(reversed.reverse().toString());
                        convert = new DecimalToHexa();
                        reversed = new StringBuilder(convert.convert(Integer.toString(sum)));
                        calculator.result4.setText(reversed.reverse().toString());
                    } else { System.out.println("inva"); }
                } else {
                    System.out.println("Invalid!");
                }
            }
        });
    }
}
