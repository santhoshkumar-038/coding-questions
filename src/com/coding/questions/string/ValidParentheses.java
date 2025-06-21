package com.coding.questions.string;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();

        for(char ch: charArr){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.add(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
