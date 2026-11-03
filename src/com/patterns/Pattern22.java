package com.patterns;

import java.util.Scanner;
/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
 */
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<(2*n-1);i++){
            for(int j=0;j<(2*n-1);j++){
                int top = i, left =j;
                int right = 2*n-j-2, bottom = 2*n-i-2;
                int min_dis = Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print(n-min_dis+" ");
            }
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)