package com.arrays;


import java.util.Scanner;
//Subarray is a contiguous part of an array. You can print all possible subarrays using three nested loops.
//Total SubArrays N* (N+1)/2
public class PrintingSubArrayInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printingSubArrays(arr,n);
        System.out.println("Total Sub Arrays for Given Array : "+totalSubarrayCount(n));
    }

    private static int totalSubarrayCount( int n) {
        return n* (n+1)/2;
    }

    private static void printingSubArrays(int[] arr, int n) {
        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
//Time Complexity O(N*N*N) and Auxiliary Space O(1)