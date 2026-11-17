package com.arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnesInBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Consecutive ones in the Given Array is : "+maxOnesConsecutive(arr,n));
    }

    private static int maxOnesConsecutive(int[] arr, int n) {
        int count =0, max_count=0;
        if(arr[0]==1){
            count++;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1] ==1 && arr[i] == 1){
                count++;
            }
            if(arr[i-1] != 1 && arr[i] == 1){
                max_count = Math.max(count, max_count);
                count=1;
            }
        }
        max_count = Math.max(max_count,count);
        return max_count;
    }
}
