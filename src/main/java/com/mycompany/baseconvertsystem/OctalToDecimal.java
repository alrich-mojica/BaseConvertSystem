package com.mycompany.baseconvertsystem;

public class OctalToDecimal implements Convertion {
    private int res = 0;
    @Override
    public String convert(String userInput) {
        boolean isNegative = userInput.startsWith("-");
        String octals = isNegative ? userInput.substring(1) : userInput;
        String octal = "01234567";
        StringBuilder reversed = new StringBuilder(octals);
        char[] arr = reversed.reverse().toString().toCharArray();

        for(int i =0; i<=arr.length-1; i++){
            int hoy = octal.indexOf(arr[i]);
            double ab = Math.pow(8,i);
            int ag = (int)ab * hoy;
            res += ag;
        }
        //return Integer.toString(res);
        return isNegative ? Integer.toString(-res) : Integer.toString(res);
    }
}
