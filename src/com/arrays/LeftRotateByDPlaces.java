package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array, the task is to Left Rotate an Array by D places.
Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2
Left Rotation means a rotation that happens Counter-Clockwise (anticlockwise).
The elements are moved counterclockwise by D number of places, which results in the elements moving back by D positions from their initial position.
condition:
When k ≥ nums.length, the rotation repeats unnecessarily.
To simplify: Reduce k to k % nums.length. This ensures that the rotation is performed only as much as necessary. Example: Input: nums = [1, 2, 3], k=4 Effective k=4%3=1.
 */
public class LeftRotateByDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(d> n){
            d = d%n;
        }
        //naiveMethodForLeftRotate(arr,n,d); // Time Complexity(d*N) and Auxiliary Space O(1)
        //efficientMethodWithSpace(arr,n,d); // Time Complexity O(N) and Auxiliary Space O(d)
        moreEfficientMethodWithoutSpace(arr,n,d); // Time Complexity O(N)
        System.out.println(Arrays.toString(arr));
    }

    private static void moreEfficientMethodWithoutSpace(int[] arr, int n, int d) {
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0,n-1);
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while(left <right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    private static void efficientMethodWithSpace(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }
    }

    private static void naiveMethodForLeftRotate(int[] arr, int n, int d) {
        for(int i=0;i<d;i++){
            leftRotateByOne(arr,n);
        }
    }

    private static void leftRotateByOne(int[] arr, int n) {
        int temp =arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
