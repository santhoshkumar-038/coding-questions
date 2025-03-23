package com.coding.questions.string;

// Reverse Words in a Given String
public class ReverseWords {
    public static String reverseWords(String words){
        String[] wordArray = words.split(" " );
        StringBuilder reversedWord = new StringBuilder();

        for(int i = wordArray.length-1; i>=0; i--){
            reversedWord.append(wordArray[i]).append(" ");
        }

        return reversedWord.toString().trim();
    }
}
