package com.arrays;

import java.util.Scanner;
/*
Given an array arr of size n, the task is to find the sum of all the elements in the array.
Input: n=5, arr = [1,2,3,4,5]
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15
 */
public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of all elements in the array is : "+elementsSum(arr,n));
    }

    private static int elementsSum(int[] arr, int n) {
        if(n==0){
            return 0;
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)