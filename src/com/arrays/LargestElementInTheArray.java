package com.arrays;

import java.util.Scanner;
//Given an array of integers nums, return the value of the largest and second-largest element in the array
public class LargestElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largestElement = firstMaxElement(arr,n);
        int secondLargest = secondMaxElement(arr,n);
        System.out.println("First Maximum Element in the Array is "+largestElement);
        System.out.println("Second Maximum Element in the Array is "+secondLargest);
    }

    private static int secondMaxElement(int[] arr, int n) {
        if(n<=1){
            return -1;
        }
        int max_ele = Integer.MIN_VALUE, second_max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max_ele){
                second_max = max_ele;
                max_ele = arr[i];
            }
            if(arr[i] > second_max && arr[i] != max_ele){
                second_max = arr[i];
            }
        }
        if(second_max == Integer.MIN_VALUE){
            return -1;
        }
        return second_max;
    }

    private static int firstMaxElement(int[] arr, int n) {
        if(n==1){
            return arr[0];
        }
        int max_elem = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max_elem = Math.max(arr[i], max_elem);
        }
        return max_elem;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)