package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays.
Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.

The intersection of two arrays is an array where all values are present in both arrays. Since both input arrays are sorted,
the resulting intersection array should also be in sorted order.
Example 1:
Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]
Output: [1, 2]
Explanation:
The elements 1, 2 are the only elements present in both nums1 and nums2
 */
public class IntersectionOfTwoSortedArrays {
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
        System.out.println(Arrays.toString(arr1)+" "+Arrays.toString(arr2));
        int[] res  = inserSectionOfArrays(arr1, n1, arr2, n2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] inserSectionOfArrays(int[] nums1, int n1, int[] nums2, int n2) {
        List<Integer> arr = new ArrayList<>();
        int i=0,j=0;
        while(i < nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }

        }
        int[] res = new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            res[k] = arr.get(k);
        }
        return res;
    }
}
// Time Complexity (M+N) and Auxiliary Space O(Min(m,n))