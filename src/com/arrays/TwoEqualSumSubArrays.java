package com.arrays;

import java.util.Scanner;
/*
Given an array of integers arr[], return true if it is possible to split it in two subarrays (without reordering the elements),
such that the sum of the two subarrays are equal. If it is not possible then return false.
Input: arr[] = [1, 2, 3, 4, 5, 5]
Output: true
Explanation: We can divide the array into [1, 2, 3, 4] and [5, 5]. The sum of both the subarrays are 10.
 */
public class TwoEqualSumSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isEqualSumExists(arr,n));
    }

    private static boolean isEqualSumExists(int[] arr, int n) {
        int sum =0,left_sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        for(int i=0;i<n;i++){
            left_sum += arr[i];
            int right_sum = sum -left_sum;
            if(left_sum == right_sum)
                return true;
        }
        return false;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)