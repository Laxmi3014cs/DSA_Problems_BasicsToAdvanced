package com.basicMath;

import java.util.Scanner;
//We are given an n-digit number. The task is to find if the number is palindrome or not, provided that, n>=0.
public class CheckNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Given Number is a Palindrome : "+n);
        }else{
            System.out.println("Given Number is not a Palindrome : "+n);
        }
    }

    private static boolean isPalindrome(int n) {
        n = Math.abs(n);
        if(n <=9){
            return true;
        }
        int temp =n, sum =0;
        while(n>0){
            int r = n%10;
            sum = sum*10 +r;
            n = n/10;
        }
        return temp == sum;
    }
}
//Time Complexity O(D) and Auxiliary Space O(1) D is number of digits in the Number