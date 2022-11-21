package org.example;

public class Validator {
    private char [] arrayOfNumbers = {'1','2','3','4','5','6','7','8','9','0'};
    private char [] arrayOfRomanSymbols = {'I','V','X'};
    private char [] arrayOfSymbols = {'+','-','/','*'};
   private boolean flagArabic;
   private boolean flagRoman;



    public String validateInputNumber(String value){
        String s;
        int countArabic = 0;
        int countRoman = 0;
        char[] arrayOfValue = value.toCharArray();
        for (Character v : arrayOfValue) {
            for (Character i : arrayOfNumbers) {
                if (v.equals(i)) {
                    countArabic++;
                }
            }}
        if (countArabic == value.length()) {
            flagArabic = true;
        } else {
            flagArabic = false;
        }

        for(Character v : arrayOfValue) {
            for (Character r : arrayOfRomanSymbols) {
                if (v.equals(r)) {
                    countRoman++;
                }
            }
        }
        if(countRoman == value.length()){
            flagRoman = true;
        }else{
            flagRoman = false;
        }

        if (flagArabic == true) {
            s = "ARABIC";

            return s;
        } else {
            if (flagRoman == true) {
                s = "ROMAN";
                return s;
            }
        }
        s = "FAIL";

        return s;
    }
    public boolean validateSymbol(String s){
        char [] array = s.toCharArray();
        int count = 0;
        for (Character v : arrayOfSymbols) {
            for (Character i :array){
                if (i.equals(v))
                    count++;
            }}
        if(count == 1)
            return true;
        return false;
    }

}
