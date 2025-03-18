package com.coding.questions.string;

//Check if a String is a Rotation of Another String

public class StringRotation {
    public static boolean isRotation(String str1, String str2){
        // If lengths are different, they cannot be rotations
        if(str1.length() != str2.length()){
            return false;
        }

        // Concatenate s1 with itself
        String concatenated = str1 + str1;

        // Check if s2 is a substring of concatenated
        return concatenated.contains(str2);
    }
}
