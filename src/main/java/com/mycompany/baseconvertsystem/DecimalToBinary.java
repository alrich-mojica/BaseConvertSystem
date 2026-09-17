package com.mycompany.baseconvertsystem;

public class DecimalToBinary implements Convertion{
    private String sum = "";
    @Override
    public String convert(String userInput) {
        int num = Integer.parseInt(userInput);
        boolean isNegative = num < 0;
        if (isNegative) {
            num = Math.abs(num);
        }
        if (num == 0) {
            return "0";
        }
        while(num>0){
            sum += Integer.toString(num%2);
            double re = Math.floor(num /=2);
            num = (int) re;
        }

        return isNegative ? sum + "-" : sum;
    }
}
