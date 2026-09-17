package com.mycompany.baseconvertsystem;

public class DecimalToOctal implements Convertion {
    private String sum = "";
    @Override
    public String convert(String userInput) {
        String[] octal = {"0","1","2","3","4","5","6","7"};
        int num = Integer.parseInt(userInput);
        boolean isNegative = num < 0;
        if (isNegative) {
            num = Math.abs(num);
        }
        if (num == 0) {
            return "0";
        }
        while(num>0){
            int a = num%8;
            sum += octal[a];
            double re = Math.floor(num /=8);
            num = (int) re;
        }
        return isNegative ? sum + "-" : sum;
    }
}
