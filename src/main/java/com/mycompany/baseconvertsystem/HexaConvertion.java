package com.mycompany.baseconvertsystem;

import java.awt.Color;

public class HexaConvertion {
    HexaConvertion(ConverterFrame frame,Convertion convert){
        String comboBox2 = (String) frame.comboBox2.getSelectedItem();
        if(frame.userInput.getText().toUpperCase().matches("^-?[0-9A-F]+$")) {
            if (comboBox2=="Decimal") {
                convert = new HexaToDecimal();
                frame.result1.setText(convert.convert(frame.userInput.getText()));
                convert = new HexaToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToOctal();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new HexaToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result3.setText(reversed.reverse().toString());
            } else if (comboBox2=="Binary") {
                convert = new HexaToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result1.setText(reversed.reverse().toString());
                convert = new HexaToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToOctal();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new HexaToDecimal();
                frame.result3.setText(convert.convert(frame.userInput.getText()));
            } else if (comboBox2=="Octal") {
                convert = new HexaToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToOctal();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result1.setText(reversed.reverse().toString());
                convert = new HexaToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new HexaToDecimal();
                frame.result3.setText(convert.convert(frame.userInput.getText()));
            } else {
                System.out.println("invalid");
            }
        } else {
            frame.userInput.setBackground(Color.red);
            System.out.println("not an");
        }
    }
}
