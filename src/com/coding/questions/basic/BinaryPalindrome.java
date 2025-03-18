package com.coding.questions.basic;

public class BinaryPalindrome {
    public static boolean binaryPalindrome(int num){
        String binaryNumber = Integer.toBinaryString(num);
        int left = 0;
        int right = binaryNumber.length() - 1;

        while(left < right) {
            if (binaryNumber.charAt(left) != binaryNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean binaryPalindrome(float num){
        int bit = Float.floatToIntBits(num);
        String binaryNumber = Integer.toBinaryString(bit);
        int left = 0;
        int right = binaryNumber.length() - 1;
        while(left < right) {
            if (binaryNumber.charAt(left) != binaryNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean binaryPalindrome(double num) {
        long bits = Double.doubleToLongBits(num);
        String binaryNumber = Long.toBinaryString(bits);
        int left = 0;
        int right = binaryNumber.length() - 1;
        while (left < right) {
            if (binaryNumber.charAt(left) != binaryNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
