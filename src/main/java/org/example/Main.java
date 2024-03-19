package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 12321;
        isPalindrome(number);
    }
    public static boolean isPalindrome(int number) {
        String numString =String.valueOf(number);
        char[] digits = numString.toCharArray();

        for (int i = 0, j=digits.length-1; i<j ; i++,j--){
            if(digits[i] != digits[j]) {
                System.out.println("Sayı palindrom değil!" + number);
                return  false;
            }
        }
        System.out.println("Sayı palindrom!" + number);
        return true;
    }
}
