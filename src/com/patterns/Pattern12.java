package com.patterns;

import java.util.Scanner;
/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321
 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int a = 1;a<=i;a++){
                System.out.print(a);
            }
            spaces -=2;
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)