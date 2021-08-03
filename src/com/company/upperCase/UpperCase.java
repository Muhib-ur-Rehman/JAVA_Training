package com.company.upperCase;

public class UpperCase {
    public String toUpperCase(String str){
        String result="";
        for (int i = 0 ; i < str.length();i++){
            if (((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)) {
                result += str.charAt(i);
            }
            else if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122){
                int ch = (int) str.charAt(i) - 32;
                result += (char) ch;
            }
            else{
                result += str.charAt(i);
            }
        }
        return result;
    }
}
