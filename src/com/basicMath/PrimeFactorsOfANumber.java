package com.basicMath;

import java.util.Scanner;
/*
We are given a number n. The task is to print all prime factors of n.
Prime Factors: They are prime numbers, which are factors of a given number.
Input:  n = 315
Output: 3 3 5 7
 */
public class PrimeFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        efficientApproach(n);   // Time Complexity O(sqrt(N)) and Auxiliary Space O(1)
        moreEfficientApproach(n); // Time Complexity O(sqrt(N)) and Auxiliary Space O(1)

    }

    private static void moreEfficientApproach(int n) {
        if(n<=1){
            return;
        }
        while (n%2==0){
            System.out.print(2+" ");
            n /=2;
        }
        while (n%3==0){
            System.out.print(3+" ");
            n /=3;
        }
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            while (n%i==0){
                System.out.print(i+" ");
                n /=i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n /= (i+2);
            }
        }
        if(n>3){
            System.out.print(n);
        }
        System.out.println();
    }

    private static void efficientApproach(int n) {
        if(n<=1){
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                System.out.print(i+" ");
                n= n/i;
            }
        }
        if(n>1){
            System.out.print(n);
        }
        System.out.println();
    }
}
