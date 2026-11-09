package com.basicMath;

import java.util.Scanner;
/*
We are given a number n. The task is to print all the divisors of n.
Divisor: A divisor is a number that completely divides a number.

 Input : n = 10
 Output: 1 2 5 10

 Input:  n = 100
 Output: 1 2 4 5 10 20 25 50 100
 */
public class AllDivisorsOFANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisors(n);
    }

    private static void printAllDivisors(int n) {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }

        }
    }
}
//Time Complexity O(Sqrt(N)) and Auxiliary Space O(1)