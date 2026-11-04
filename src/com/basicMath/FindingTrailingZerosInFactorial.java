package com.basicMath;

import java.util.Scanner;
/*
We are given a number. The task is to find the Number of Trailing Zeros in the factorial of the number.
The Trailing Zeros are the Zeros, which appear at the end of a number(factorial in that case)
Input: 5
Output: 1
// Factorial of 5 = 5*4*3*2*1 = 120, which has one trailing 0.
 */
public class FindingTrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Trailing Zeros in Factorial of Given Number : "+zerosinFactorail(n));
    }

    private static int zerosinFactorail(int n) {
        int res =0;
        for(int i=5;i<=n;i=i*5){
            res += n/i;
        }
        return res;
    }
}
// Time Complexity O(logN) and Auxiliary Space O(1)