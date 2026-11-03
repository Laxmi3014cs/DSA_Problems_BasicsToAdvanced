package com.patterns;

import java.util.Scanner;

/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUpperLoop(n);
        printLowerLoop(n);
    }

    private static void printLowerLoop(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printUpperLoop(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i-1)*2;k++){
                System.out.print(" ");
            }
            for(int a =i;a<=n;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)