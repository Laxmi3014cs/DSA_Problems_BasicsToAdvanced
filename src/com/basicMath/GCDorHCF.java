package com.basicMath;

import java.util.Scanner;
/*
We are given two numbers. The task is to find the GCD / HCF of the numbers.
GCD: Greatest Common Divisor
HCF: Highest Common Factor
Input: a = 20, b = 28
Output: 4
 */
public class GCDorHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Printing GCD if Two Numbers : "+naiveMethod(a,b)); // Time complexity O(min(a,b)) and Auxiliary Space O(1)
        System.out.println("Printing GCD if Two Numbers : "+euclideanApproach(a,b)); // Time Complexity O(min(a,b)) and Auxiliary Space O(1)
        System.out.println("Printing GCD if Two Numbers : "+euclideanApproachOptimized(a,b)); // Time Complexity O(log(min(a,b))) and Auxiliary Space O(1)
    }

    private static int euclideanApproachOptimized(int a, int b) {
        if(b==0){
            return a;
        }
        return euclideanApproachOptimized(b,a%b);
    }

    private static int euclideanApproach(int a, int b) {
        while(a!=b){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }

    private static int naiveMethod(int a, int b) {
        int res = Math.min(a,b);
        while(res >0){
            if(a%res ==0 && b%res ==0){
                return  res;
            }
            res--;
        }
        return res;
    }
}
