package org.example;

public class Main {

    public static void main(String[] args) {
        int number = 28;
        isPalindrome(number);
        isPerfectNumber(number);

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
    public static boolean isPerfectNumber(int number){
        int sum=0;
        for (int i=1; i<=number/2 ; i++){
            if (number % i == 0) {
                sum=sum+i;
            }

        }
        if (sum == number) {
            System.out.println("Mükemmel sayı!" + number);
            return true;
        }
        else {
            System.out.println("Mükemmel sayı değil!" + number);
            return false;
        }

    }
}
