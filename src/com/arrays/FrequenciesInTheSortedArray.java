package com.arrays;

import java.util.Scanner;
/*
Given a sorted array, arr[] consisting of N integers, the task is to find the frequencies of each array element.
Input: arr[] = {2, 2, 6, 6, 7, 7, 7, 11}
Output:        Frequency of 2 is: 2
               Frequency of 6 is: 2
               Frequency of 7 is: 3
               Frequency of 11 is: 1
 */
public class FrequenciesInTheSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printingFrequenciesOfEachElement(arr,n);
    }

    private static void printingFrequenciesOfEachElement(int[] arr, int n) {
        int count =1;
        for(int i=1;i<n;i++){
            if(arr[i-1] == arr[i]){
                count++;
            }else {
                System.out.println(" Frequency of "+ arr[i-1]+" is : "+count);
                count =1;
            }
        }
        System.out.println(" Frequency of "+ arr[n-1]+" is : "+count);
    }
}
// Time Complexity O(N) and Auxiliary Space O(1)