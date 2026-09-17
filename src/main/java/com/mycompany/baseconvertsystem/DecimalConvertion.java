package com.mycompany.baseconvertsystem;

import java.awt.Color;

public class DecimalConvertion {
    DecimalConvertion(ConverterFrame frame,Convertion convert){

        String comboBox2 = (String) frame.comboBox2.getSelectedItem();
        if(frame.userInput.getText().matches("^-?[0-9]+$")) {
            if(comboBox2=="Binary") {
                convert = new DecimalToBinary();
                StringBuilder reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result1.setText(reversed.reverse().toString());
                convert = new DecimalToHexa();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result2.setText(reversed.reverse().toString());
                convert = new DecimalToOctal();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result3.setText(reversed.reverse().toString());	
            } else if (comboBox2=="Hexa") {
                convert = new DecimalToHexa();
                StringBuilder reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result1.setText(reversed.reverse().toString());
                convert = new DecimalToOctal();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result2.setText(reversed.reverse().toString());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result3.setText(reversed.reverse().toString());
            } else if (comboBox2=="Octal") {
                convert = new DecimalToOctal();
                StringBuilder reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result1.setText(reversed.reverse().toString());
                convert = new DecimalToHexa();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result2.setText(reversed.reverse().toString());
                convert = new DecimalToBinary();
                reversed = new StringBuilder(convert.convert(frame.userInput.getText()));
                frame.result3.setText(reversed.reverse().toString()); 
            }
        } else {
            frame.userInput.setBackground(Color.red);
            System.out.println("not an");
        }	
    }
}
