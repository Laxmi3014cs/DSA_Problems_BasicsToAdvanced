package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
Given an array arr[], perform the following operations.
Sort all elements at even indices in increasing order and all elements at odd indices in decreasing order.
Construct the final array by placing all sorted even-indexed elements first, followed by all sorted odd-indexed elements in decreasing order.
Input: arr[] = [1, 1, 2, 3, 4, 5, 6, 7]
Output: [1, 2, 4, 6, 7, 5, 3, 1]
Explanation: Even-indexed elements are 1, 2, 4, 6, which after sorting become 1, 2, 4, 6. Odd-indexed elements are 1, 3, 5, 7, which after sorting in decreasing order become 7, 5, 3, 1.
The final array is formed by placing the sorted even-indexed elements first, followed by the sorted odd-indexed elements.
 */
public class BitonicGeneratorSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = sortingAlgorithim(arr, n);
        System.out.println(res);
    }

    private static ArrayList<Integer> sortingAlgorithim(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if(n<=1){
            res.add(arr[0]);
            return res;
        }

        int[] even = new int[(n+1)/2];
        int[] odd = new int[n / 2];
        int j=0, k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[j++] = arr[i];
            }else{
                odd[k++] = arr[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int value : even) {
            res.add(value);
        }
        for(int i=odd.length-1;i>=0;i--){
            res.add(odd[i]);
        }
        return res;
    }
}
//Time Complexity O(NLogN) And Auxiliary Space O(N)