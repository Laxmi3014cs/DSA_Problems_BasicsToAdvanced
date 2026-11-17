package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
This must be done in place, without making a copy of the array.
Input: nums = [0, 1, 4, 0, 5, 2]
Output: [1, 4, 5, 2, 0, 0]
Explanation:
Both the zeroes are moved to the end and the order of the other elements stay the same
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZerosToEndOfTheArray(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEndOfTheArray(int[] arr, int n) {
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)