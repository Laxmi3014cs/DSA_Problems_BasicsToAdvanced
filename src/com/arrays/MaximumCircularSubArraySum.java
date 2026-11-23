package com.arrays;

import java.util.Scanner;
/*
Given an array of integers arr[] of size n, find the maximum possible sum of a non-empty subarray.
The array is circular, which means the last element is connected to the first element. Therefore,
a subarray can either be a normal contiguous subarray or a circular subarray that wraps around the end of the array to the beginning.
Your task is to return the maximum sum of any non-empty circular subarray.
Input:
arr[] = [8, -8, 9, -9, 10, -11, 12]

Output:
22
 */
public class MaximumCircularSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Circular SubArray Sum is : "+maxCircularSubArraySum(arr,n));
    }

    private static int maxCircularSubArraySum(int[] arr, int n) {
        int max_sum_Subarray = maxSumSubArray(arr,n);
        int sum =0;
        if(max_sum_Subarray <0){
            return max_sum_Subarray;
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
            arr[i] = - arr[i];
        }
        int circular_max_subarray = sum + maxSumSubArray(arr,n);
        return Math.max(circular_max_subarray, max_sum_Subarray);

    }

    private static int maxSumSubArray(int[] arr, int n) {
        int res=arr[0], max_end_here = arr[0];
        for(int i=1;i<n;i++){
            max_end_here = Math.max(max_end_here+arr[i], arr[i]);
            res = Math.max(res, max_end_here);
        }
        return res;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)