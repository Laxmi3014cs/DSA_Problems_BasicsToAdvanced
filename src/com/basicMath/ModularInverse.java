package com.basicMath;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
/*
Given two integers n and m, return the smallest positive integer x such that (n * x) % m = 1, i.e.,
the modular multiplicative inverse of n under modulo m. If no such integer exists, return -1.
Input: n = 10, m = 17
Output: 12
Explanation: Since (12*10) mod 17 = 1, 12 is the modulo inverse of 10.
 */
public class ModularInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int res = modular(n,m);
        if(res !=-1) {
            System.out.println("Modular Inverse : " + res);
        }else{
            System.out.println("Modular Inverse is not present");
        }
    }

    private static int modular(int n, int m) {
        if(n%m==0){
            return -1;
        }
        for(int i=1;i<=m;i++){
            if((n*i)%m == 1){
                return i;
            }
        }
        return -1;
    }
}
//Time Complexity O(M) and Auxiliary Space O(1)