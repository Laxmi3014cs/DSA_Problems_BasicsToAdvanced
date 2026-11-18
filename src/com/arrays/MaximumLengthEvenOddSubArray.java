package com.arrays;

import java.util.Scanner;
/*
 Given an array a[ ] of N integers, the task is to find the length of the longest Alternating Even Odd subarray present in the array.
Input: a[] = {1, 2, 3, 4, 5, 7, 9}
Output: 5
Explanation:
The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.
 */
public class MaximumLengthEvenOddSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Length Of Even and Odd Sub Array is : "+maxOddEven(arr,n));
    }

    private static int maxOddEven(int[] arr, int n) {
        int res =1, cur=1;
        for(int i=1;i<n;i++){
            if((arr[i-1]%2 ==0 && arr[i]%2 !=0) ||(arr[i-1] %2 !=0 && arr[i]%2==0)){
                cur++;
                res = Math.max(res,cur);
            }
        }
        return  res;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)