package com.mycompany.baseconvertsystem;

public class HexaToDecimal implements Convertion {
    private int res = 0;
    @Override
    public String convert(String userInput) {
        boolean isNegative = userInput.startsWith("-");
        String hexas = isNegative ? userInput.substring(1) : userInput;

        String hexa = "0123456789ABCDEF";
        StringBuilder reversed = new StringBuilder(hexas.toUpperCase());
        char[] arr = reversed.reverse().toString().toCharArray();

        for(int i =0; i<=arr.length-1; i++){
            int hoy = hexa.indexOf(arr[i]);
            double ab = Math.pow(16,i);
            int ag = (int)ab * hoy;
            res += ag;
        }
        return isNegative ? Integer.toString(-res) : Integer.toString(res);
    }
}
