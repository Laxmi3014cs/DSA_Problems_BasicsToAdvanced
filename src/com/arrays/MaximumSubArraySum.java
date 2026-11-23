package com.arrays;

import java.util.Scanner;
/*
Given an array arr[], the task is to find sum contiguous subarray of numbers that has the largest sum.
Input: arr = [-2, -3, 4, -1, -2, 1, 5, -3]
Output: 7
Explanation:
In the above input, the maximum contiguous subarray sum is 7 and the elements of the subarray are [4, -1, -2, 1, 5]
 */
public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum SubArray Sum is : "+maxSumSubarray(arr,n));
    }

    private static int maxSumSubarray(int[] arr, int n) {
        int res=arr[0], max_end_here = arr[0];
        for(int i=1;i<n;i++){
            max_end_here = Math.max(max_end_here+arr[i], arr[i]);
            res = Math.max(res, max_end_here);
        }
        return res;
    }
}
// Time Complexity O(N) and Auxiliary Space O(1)