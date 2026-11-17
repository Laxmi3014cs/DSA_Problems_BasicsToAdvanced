package com.arrays;

import java.util.Scanner;
/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.
Input: nums = [0, 2, 3, 1, 4]
Output: 5
Explanation:
nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
 */
public class FindingMissingNumberFrom0ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Number is : "+missingNumber(arr,n));
    }

    private static int missingNumber(int[] arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int naturalSum = n*(n+1)/2;
        return naturalSum -sum;
    }
}
//Time Complexity ON) and Auxiliary Space O(1)