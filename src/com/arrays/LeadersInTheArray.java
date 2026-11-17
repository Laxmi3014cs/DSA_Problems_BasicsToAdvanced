package com.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/*
Given an array, the task is to write a program to print all the LEADERS in the array.
An element is a leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
Input: arr[] = {16, 17, 4, 3, 5, 2},
Output: 17, 5, 2

Input: arr[] = {1, 2, 3, 4, 5, 2},
Output: 5, 2
 */
public class LeadersInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = leadersInTheArrayFromLeftToRight(arr,n);
        System.out.println(res);
    }

    private static ArrayList<Integer> leadersInTheArrayFromLeftToRight(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int cur_ldr = arr[n-1];
        res.add(cur_ldr);
        for(int i=n-2;i>=0;i--){
            if(arr[i] > cur_ldr){
                cur_ldr = arr[i];
                res.add(cur_ldr);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
// Time Complexity O(N) and Auxiliary Space O(1)