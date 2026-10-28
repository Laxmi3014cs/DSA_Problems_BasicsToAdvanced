package com.patterns;

import java.util.Scanner;
/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i -1)/2;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch);
                if(j<= breakPoint){
                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
// Time Complexity O(N*N) And Auxiliary Space O(1)