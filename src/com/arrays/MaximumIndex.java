package com.arrays;

import java.util.Scanner;

/*
Given an array arr[] of positive integers, return the maximum difference between two indices j and i (i.e., j - i) such that arr[i] ≤ arr[j] and i ≤ j.
Examples:
Input: arr[] = [1, 10]
Output: 1
Explanation: arr[0] ≤ arr[1] so (j-i) is 1-0 = 1.
Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
Output: 6
Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] ≤ arr[j]) thus giving the maximum difference of j - i which is 6(7-1).
 */
public class MaximumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxIndex(arr,n));
    }

    private static int maxIndex(int[] arr, int n) {
        int[] right_max = new int[n];
        int max = right_max[n-1];
        for(int i=n-1;i>=0;i--){
            right_max[i] = Math.max(arr[i], max);
            max = right_max[i];
        }
        int i=0, j=0,res=0;
        while(i<n && j<n){
            if(arr[i] <= right_max[j]){
                res = Math.max(res, j-i);
                j++;
            }else{
                i++;
            }
        }
        return res;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)