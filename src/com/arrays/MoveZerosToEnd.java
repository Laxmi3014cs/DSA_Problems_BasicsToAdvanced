package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZerosToEndOfTheArray(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEndOfTheArray(int[] arr, int n) {
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] !=0){
                int temp=arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
