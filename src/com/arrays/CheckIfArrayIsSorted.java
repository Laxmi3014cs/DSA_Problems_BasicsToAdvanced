package com.arrays;

import java.util.Scanner;
/*
Given an array arr of size n, the task is to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order.
Input: n = 5, arr = [1,2,3,4,5]
Output: True
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
 */
public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(isArraySorted(arr,n)){
            System.out.println("Given Array is Sorted");
        }else {
            System.out.println("Given Array is not sorted");
        }
    }

    private static boolean isArraySorted(int[] arr, int n) {
        for(int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)