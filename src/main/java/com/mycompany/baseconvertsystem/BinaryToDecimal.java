package com.mycompany.baseconvertsystem;

public class BinaryToDecimal implements Convertion{
    private int res = 0;
    @Override
    public String convert(String userInput) {
	boolean isNegative = userInput.startsWith("-");
	String binary = isNegative ? userInput.substring(1) : userInput;
	StringBuilder reversed = new StringBuilder(binary);
        char[] arr = reversed.reverse().toString().toCharArray();
        		
	for(int i =0; i<=arr.length-1; i++){
            if(arr[i]=='1'){
		double ab = Math.pow(2,i);
		res += ab;
            }
	}
	return isNegative ? Integer.toString(-res) : Integer.toString(res);
    }
}
