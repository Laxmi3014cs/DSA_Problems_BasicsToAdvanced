package com.patterns;

import java.util.Scanner;
//Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
//*
//**
//***
//****
//*****
//****
//***
//**
//*
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Time Complexity O(N*N) and Auxiliary Space O(1)