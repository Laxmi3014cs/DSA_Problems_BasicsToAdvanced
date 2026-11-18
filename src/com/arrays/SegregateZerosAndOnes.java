package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.
Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].
 */
public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        segregateArrays(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregateArrays(int[] arr, int n) {
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] ==0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)