package com.arrays;

import java.util.Scanner;
/*
Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).
Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size.

 */
public class MajorityElementNByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = majorityElement(arr,n);
        if(res == -1){
            System.out.println("Majority Element Not Present");
        }else {
            System.out.println("Majority Element is "+res);
        }
    }

    private static int majorityElement(int[] arr, int n) {
        int ele = arr[0], count =1;
        for(int i=1;i<n;i++){
            if(arr[i] == ele){
                count++;
            }else{
                count--;
            }
            if(count ==0){
                ele = arr[i];
                count =1;
            }
        }
        int ele_count=0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele){
                ele_count++;
            }
        }
        if(ele_count >n/2){
            return ele;
        }
        return  -1;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)