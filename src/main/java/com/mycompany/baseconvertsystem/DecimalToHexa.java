package com.mycompany.baseconvertsystem;

public class DecimalToHexa implements Convertion {
    private String sum = "";
    @Override
    public String convert(String userInput) {
        String[] hexa = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int num = Integer.parseInt(userInput);
        boolean isNegative = num < 0;
        if (isNegative) {
            num = Math.abs(num);
        }
        if (num == 0) {
            return "0";
        }
        while(num>0){
            int a = num%16;
            sum += hexa[a];
            double re = Math.floor(num /=16);
            num = (int) re;
        }
        return isNegative ? sum + "-" : sum;
    }
}
