package com.patterns;

import java.util.Scanner;
/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUpperLoop(n);
        printLowerLoop(n);
    }

    private static void printUpperLoop(int n) {
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
    private static void printLowerLoop(int n) {
        for(int i=n-1;i>=1;i--){
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
}
//Time Complexity O(N*N) and Auxiliary SpaceO(1)