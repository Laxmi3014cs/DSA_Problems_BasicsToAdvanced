package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.
Example 1:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
 */
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int[] res = unionSortArrays(arr1, n1, arr2,n2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] unionSortArrays(int[] arr1, int n1, int[] arr2, int n2) {
        Set<Integer> res = new TreeSet<>();
        for(int i=0;i<n1;i++){
            res.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            res.add(arr2[i]);
        }
        int ind =0;
        int[] res_arr = new int[res.size()];
        for(int num :res){
            res_arr[ind++] = num;
        }
        return res_arr;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)