package com.arrays;

import java.util.Scanner;

public class SearchElementInTheUnSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(isElementPresent(arr,n,k)){
            System.out.println("Given Element is present in the array");
        }else{
            System.out.println("Given Element is Not Present in the array");
        }
    }

    private static boolean isElementPresent(int[] arr, int n, int k) {
        for(int i=0;i<n;i++){
            if(k == arr[i]){
                return true;
            }
        }
        return false;
    }
}
// Time Complexity O(N) and Auxiliary Space O(1)