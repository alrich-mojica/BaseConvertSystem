package com.mycompany.baseconvertsystem;

import java.awt.Color;

public class OctalConvertion {
    OctalConvertion(ConverterFrame frame,Convertion convert){
        String comboBox2 = (String) frame.comboBox2.getSelectedItem();
        if(frame.userInput.getText().matches("^-?[0-7]+$")) {
            if (comboBox2=="Decimal") {
                convert = new OctalToDecimal();
                frame.result1.setText(convert.convert(frame.userInput.getText()));
                convert = new OctalToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToHexa();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new OctalToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result3.setText(reversed.reverse().toString());
            } else if (comboBox2=="Binary") {
                convert = new OctalToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result1.setText(reversed.reverse().toString());
                convert = new OctalToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToHexa();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new OctalToDecimal();
                frame.result3.setText(convert.convert(frame.userInput.getText()));
            } else if (comboBox2=="Hexa") {
                convert = new OctalToDecimal();
                String userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToHexa();
                StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                frame.result1.setText(reversed.reverse().toString());
                convert = new OctalToDecimal();
                userInput = convert.convert(frame.userInput.getText());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(userInput));
                frame.result2.setText(reversed.reverse().toString());
                convert = new OctalToDecimal();
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
