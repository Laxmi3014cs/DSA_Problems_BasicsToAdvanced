package com.basicMath;
/*
Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
//Sieve of Eratosthenes is the algorithm to find all the prime numbers less than or equal to a given integer n.
//The algorithm terminates, all the numbers in the list that are not marked are prime
Input : n =10
Output: 2 3 5 7

Input : n = 20
Output: 2 3 5 7 11 13 17 19
 */

import java.util.Arrays;
import java.util.Scanner;

public class FindingAllThPrimesLessThanAreEqualToGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllPrimeNumbers(n);

    }

    private static void printAllPrimeNumbers(int n) {
        if(n<=1){
            return;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2;i<=Math.sqrt(n);i++){
           if(isPrime[i]){
               for(int j=2*i;j<=n;j=j+i){
                   isPrime[j] = false;
               }
           }
        }
        for(int i=2;i<isPrime.length;i++){
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
// Time Complexity O(N*Log(LogN)) and Auxiliary Space O(1)