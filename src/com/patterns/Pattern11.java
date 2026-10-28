package com.patterns;

import java.util.Scanner;
/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int start =1;
            if(i%2==1){
                start =1;
            }else{
                start =0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)
