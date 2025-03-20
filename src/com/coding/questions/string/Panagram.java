package com.coding.questions.string;

import java.util.HashSet;
import java.util.Set;

//A pangram is a sentence that contains every letter of the English alphabet at least once (A-Z or a-z).
public class Panagram {

    public static boolean isPanagram(String str){
        if(str == null || str.length() < 26){
            return false;
        }

        Set<Character> characterSet = new HashSet<>();
        for(Character ch: str.toLowerCase().toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                characterSet.add(ch);
                if(characterSet.size() == 26){
                    return true;
                }
            }
        }
        return false;
    }
}
