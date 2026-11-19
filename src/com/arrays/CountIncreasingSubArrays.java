package com.arrays;

import java.util.Scanner;
/*
Given an array arr[] of integers, return the number of subarrays in arr[] which are strictly increasing with size greater or equal to 2.
A subarray is a contiguous part of array. A subarray is strictly increasing if each element is greater then it's previous element if it exists.
Examples:
Input: arr[] = [1, 4, 5, 3, 7, 9]
Output: 6
Explanation: The strictly increasing subarrays are: [1, 4], [1, 4, 5], [4, 5], [3, 7], [3, 7, 9], [7, 9]
 */
public class CountIncreasingSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countIncreasingNaiveMethod(arr,n)); // Time Complexity O(N*N) and Auxiliary Space O(1)
        System.out.println(countIncreasingEfficienteMethod(arr,n)); // Time Complexity O(N) and Auxiliary Space O(1)
    }

    private static int countIncreasingEfficienteMethod(int[] arr, int n) {
        int count =0, cur=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] <arr[i+1]){
                cur++;
            }else{
                cur=0;
            }
            count += cur;
        }
        return count;
    }

    private static int countIncreasingNaiveMethod(int[] arr, int n) {
        int count =0;
        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                count++;
                int j= i+1;
                while (j<n-1 && arr[j] < arr[j+1]){
                    count++;
                    j++;
                }
            }
        }
        return count;
    }
}
