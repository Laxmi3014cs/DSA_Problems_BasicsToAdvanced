package com.arrays;

import java.util.Scanner;

/*
Given an array of n elements. The task is to return the count of the number of odd numbers in the array.
Input: n=5, array = [1,2,3,4,5]
Output: 3
Explanation: The three odd elements are (1,3,5).
 */
public class CountOddNumbersInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Count of odd number in the array is : "+oddNumbersCount(arr,n));
    }

    private static int oddNumbersCount(int[] arr, int n) {
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                count++;
            }
        }
        return count;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)