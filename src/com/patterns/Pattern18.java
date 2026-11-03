package com.patterns;

import java.util.Scanner;

/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
E
D E
C D E
B C D E
A B C D E
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = (char) ('A'+n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(ch + j-i));
            }
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)