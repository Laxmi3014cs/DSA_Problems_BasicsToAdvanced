package com.patterns;

import java.util.Scanner;
//Given an integer n. You need to recreate the pattern given below for any value of N.
// Let's say for N = 5, the pattern should look like as below:

//12345
//1234
//123
//12
//1
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" "); // Time Complexity O(N*N) and Auxiliary Space O(1)
            }
            System.out.println();
        }
    }
}
