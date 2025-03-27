package com.coding.questions.basic;

public class VowelsConsonantsCounter {

    public static void vowelsConsonantsCounter(String str){
        int vowels=0, consonants=0;
        str = str.toLowerCase();

        for(char ch: str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
