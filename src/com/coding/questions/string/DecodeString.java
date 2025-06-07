package com.coding.questions.string;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String word) {
        // Stack to store repeat counts like 3, 2, etc.
        Stack<Integer> countStack = new Stack<>();

        // Stack to store previous strings before entering brackets
        Stack<String> stringStack = new Stack<>();

        // Temporary variable to build current number (like 12, 3, etc.)
        int k = 0;

        // This will store the string we're currently building
        String currentString = "";

        // Loop through each character in the input string
        for (char ch : word.toCharArray()) {

            // If the character is a digit, build the full number (handles multi-digit too)
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // Example: '2' → 2, then '3' → 2*10 + 3 = 23
            }

            // If we see an opening bracket, push current number and string onto stacks
            else if (ch == '[') {
                countStack.add(k);               // Store repeat count
                stringStack.add(currentString);  // Store current string before this bracket
                k = 0;                           // Reset number for next use
                currentString = "";              // Start building new inner string
            }

            // If we see a closing bracket, it's time to decode
            else if (ch == ']') {
                int repeatCount = countStack.pop();        // Get how many times to repeat
                String prevString = stringStack.pop();     // Get string before current bracket
                currentString = prevString +               // Combine previous string with
                        currentString.repeat(repeatCount); // repeated current part
            }

            // If it's a normal character, add to current string
            else {
                currentString += ch;
            }
        }

        // Final decoded string
        return currentString;
    }
}
