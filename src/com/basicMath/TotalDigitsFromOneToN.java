package com.basicMath;

import java.util.Scanner;
/*
Given a number n, count the total number of digits required to write all numbers from 1 to n.
Input: n = 13
Output: 17
Explanation: There are total 17 digits required to write all numbers from 1 to 13.
 */
public class TotalDigitsFromOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = totalDigits(n);
        System.out.println("There are total "+res+" digits required to write all numbers from 1 to "+n);
    }

    private static int totalDigits(int n) {
        int start=1,digits=1,count=0;
        while(start<=n){
            int end = Math.min(n, start*10-1);
            count += (end-start+1)*digits;
            digits++;
            start *=10;
        }
        return count;
    }
}
//Time Complexity O(logN) and Auxiliary Space O(1)