package com.basicMath;

import java.util.Scanner;
/*
Given an integer n, find the number of digits in the value of n factorial.
Input: n = 120
Output: 199
Explanation: The number of digits in 120! is 199
Input: n = 5
Output: 3
Explanation: Factorial of 5 is 120. Number of digits in 120 is 3 (1, 2, and 0)
 */
public class DigitsInAFactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digits in Factorial of a Given Number : "+digitsInFact(n));
    }

    private static int digitsInFact(int n) {
        double res =0;
        for(int i=1;i<=n;i++){
            res += Math.log10(i);

        }
        return (int)(Math.floor(res)+1);
    }
}
// Time Complexity O(N) and Auxiliary SpaceO(1)