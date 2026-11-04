package com.basicMath;

import java.util.Scanner;
//You are given an integer n. You need to return the number of digits in the number.
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number of Digits Present in the given Number is : "+countDigitNumber(n));
    }

    private static int countDigitNumber(int n) {
        n = Math.abs(n);
        if(n<10){
            return 1;
        }
        int count =0;
        while(n>0){
            n =n/10;
            count++;
        }
        return count;
    }
}
// Time Complexity O(D) and Auxiliary Space O(1) and D is number of digits in the number