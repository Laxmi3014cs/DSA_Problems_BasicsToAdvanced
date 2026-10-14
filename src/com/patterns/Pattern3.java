package com.patterns;

import java.util.Scanner;
//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:
//
//1
//12
//123
//1234
//12345
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" "); //Time ComplexityO(N*N) and Auxiliary SpaceO(1)
            }
            System.out.println();
        }
    }
}
