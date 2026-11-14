package com.arrays;

import java.util.Scanner;
//Given a sorted array, the task is to remove the duplicate elements from the array.
//Input  : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
//Output : arr[] = {1, 2, 3, 4, 5}
//         new size = 5
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Size of Distinct Elements in The Array "+sizeOfDistinctElements(arr,n));
    }

    private static int sizeOfDistinctElements(int[] arr, int n) {
        int res =1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                arr[res++] = arr[i];
            }
        }
        return res;
    }
}
// Time Complexity O(N) and Auxiliary Space O(1)