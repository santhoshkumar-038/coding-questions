package com.coding.questions.string;

public class FirstNonRepeatedCharacterRunner {
    public static void main(String[] args) {
        String word1 = "santhosh";
        FirstNonRepeatedCharacter firstNonRepeatedCharcter = new FirstNonRepeatedCharacter();
        Character result1 = firstNonRepeatedCharcter.firstNonRepeatedCharacter(word1);
        if(result1 != null) {
            System.out.println("First non-repeated character found:" + result1);
        }else{
            System.out.println("No non-repeated character found.");
        }

        String word2 = "banana";
        Character result2 = firstNonRepeatedCharcter.firstNonRepeatedCharacterWithContainsKey(word2);
        if(result2 != null) {
            System.out.println("First non-repeated character found:" + result2);
        }else{
            System.out.println("No non-repeated character found.");
        }

        String word3 = "pineapple";
        int indexOfNonRepeatedChar = firstNonRepeatedCharcter.firstNonRepeatedCharacterIndex(word3);
        if(indexOfNonRepeatedChar != -1){
            System.out.println("First non-repeated character found at index: " + indexOfNonRepeatedChar);
        }else{
            System.out.println("No non-repeated character found.");
        }
    }
}
