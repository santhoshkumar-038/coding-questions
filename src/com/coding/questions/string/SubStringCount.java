package com.coding.questions.string;

public class SubStringCount {
    public static int subStringCount(String str, String subString){
       String[] subStringArr = str.split(subString, -1); // it includes trailing empty spaces.
       return subStringArr.length - 1;
    }
}
