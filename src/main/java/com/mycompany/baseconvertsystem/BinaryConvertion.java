package com.mycompany.baseconvertsystem;

import java.awt.Color;

public class BinaryConvertion {
    
	BinaryConvertion(ConverterFrame frame,Convertion convert){
            String comboBox2 = (String) frame.comboBox2.getSelectedItem();
            if(frame.userInput.getText().matches("^-?[01]+$")) {
		if (comboBox2=="Decimal") {	
                    convert = new BinaryToDecimal();
                    frame.result1.setText(convert.convert(frame.userInput.getText()));
                    convert = new BinaryToDecimal();
                    String userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToOctal();
                    StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                    frame.result2.setText(reversed.reverse().toString());
                    convert = new BinaryToDecimal();
                    userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToHexa();
		    reversed = new StringBuilder(convert.convert(userInput));
		    frame.result3.setText(reversed.reverse().toString());
		} else if(comboBox2=="Hexa"){
                    convert = new BinaryToDecimal();
                    String userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToHexa();
		    StringBuilder reversed = new StringBuilder(convert.convert(userInput));
		    frame.result1.setText(reversed.reverse().toString());
		    convert = new BinaryToDecimal();
                    userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToOctal();
                    reversed = new StringBuilder(convert.convert(userInput));
                    frame.result2.setText(reversed.reverse().toString());
                    convert = new BinaryToDecimal();
                    frame.result3.setText(convert.convert(frame.userInput.getText()));
                } else if(comboBox2=="Octal"){
                    convert = new BinaryToDecimal();
                    String userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToOctal();
                    StringBuilder reversed = new StringBuilder(convert.convert(userInput));
                    frame.result1.setText(reversed.reverse().toString());
                    convert = new BinaryToDecimal();
                    userInput = convert.convert(frame.userInput.getText());
                    convert = new DecimalToHexa();
                    reversed = new StringBuilder(convert.convert(userInput));
		    frame.result2.setText(reversed.reverse().toString());
		    convert = new BinaryToDecimal();
                    frame.result3.setText(convert.convert(frame.userInput.getText()));
		} else {
                    System.out.println("not an");
                }
	} else {
                frame.userInput.setBackground(Color.red);
		System.out.println("not an");
	}
	}
}
