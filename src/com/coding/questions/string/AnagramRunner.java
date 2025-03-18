package com.coding.questions.string;

public class AnagramRunner {
    public static void main(String[] args) {
        String str1 = "Triangle";
        String str2 = "Integral";
        Anagram anagram = new Anagram();
        boolean result = anagram.isAnagram(str1, str2);

        if(result){
            System.out.println(str1 + " and " + str2 + " are Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
    }
}
