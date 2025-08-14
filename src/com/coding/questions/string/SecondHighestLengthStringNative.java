package com.coding.questions.string;

import java.util.*;

public class SecondHighestLengthStringNative {

    public static String secondHighestLengthStringNative(List<String> stringList){
        String longest = "";
        String secondLongest = "";

        for(String s: stringList){
            if(s.length() > longest.length()){
                secondLongest = longest;
                longest = s;
            }else if(s.length() > secondLongest.length() && s.length() < longest.length()){
                secondLongest = s;
            }
        }
        return secondLongest;
    }
}
