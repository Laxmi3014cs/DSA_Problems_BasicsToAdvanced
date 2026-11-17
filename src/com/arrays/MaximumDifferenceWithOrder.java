package com.arrays;

import java.util.Scanner;

/*
Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger element appears after the smaller number.
Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2.

Input : arr = {7, 9, 5, 6, 3, 2}
Output : 2
Explanation : The maximum difference is between 9 and 7.
 */
public class MaximumDifferenceWithOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDifWithOrder(arr,n));
    }

    private static int maxDifWithOrder(int[] arr, int n) {
        int max_dif = arr[1] - arr[0], min_val = arr[0];
        for(int i=1;i<n;i++){
            max_dif = Math.max(max_dif, arr[i]-min_val);
            min_val = Math.min(min_val, arr[i]);
        }
        return  max_dif;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)