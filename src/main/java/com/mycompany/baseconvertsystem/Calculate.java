package com.mycompany.baseconvertsystem;

public class Calculate {
    public int sum(int num1, int num2, String ope) {
        int total = 0;

        switch(ope) {
            case "   +": total = num1 + num2; break;
            case "   -": total = num1 - num2; break;
            case "   *": total = num1 * num2; break;
            case "   /": total = num1 / num2; break;
            default: total=0; break;
        }
        return total;
		
    }
	
	
}
