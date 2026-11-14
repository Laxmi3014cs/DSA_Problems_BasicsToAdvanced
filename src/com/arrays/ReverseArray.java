package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseTheGivenArray(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseTheGivenArray(int[] arr, int n) {
        int left=0, right = n-1;
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
    }
}
// Time Complexity O(N/2) and Auxiliary Space O(1)