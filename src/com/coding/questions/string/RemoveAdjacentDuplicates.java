package com.coding.questions.string;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String word) {
        // Stack to store characters that are not yet removed
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string
        for (char ch : word.toCharArray()) {
            // If stack is not empty and the top character is the same as current
            // it means we found a duplicate, so remove the top one
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // Remove the duplicate pair
            } else {
                stack.push(ch); // Otherwise, add the current char to the stack
            }
        }

        // Now rebuild the result string from the characters left in the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }
}
