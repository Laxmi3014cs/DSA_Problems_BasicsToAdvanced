package com.basicMath;

import java.util.Arrays;
import java.util.Scanner;
/*
Given a positive integer n, you need to count the numbers less than or equal to n having exactly 9 divisors.
Input: n = 100
Output: 2
Explanation: Numbers which have exactly 9 divisors are 36 and 100.
Input: n = 200
Output: 3
Explanation: Numbers which have exactly 9 divisors are 36, 100, 196.
 */
public class NineDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countNumbers(n);
        System.out.println(res);
    }

    private static int countNumbers(int n) {
        int k = (int)Math.sqrt(n);
        boolean[] isPrime = new boolean[k+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=k;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=k;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count =0;
        for(int i=2;i<isPrime.length;i++){
            if(isPrime[i]){
                if(Math.pow(i,8)<=n){
                    count++;
                    //System.out.print(i+" --");
                }
                for(int j=i+1;j<isPrime.length;j++){
                    if(isPrime[j] && Math.pow(i,2)*Math.pow(j,2)<=n){
                        count++;
                       // System.out.println(i+" "+j+" ");
                    }

                }
            }
        }
        return count;
    }
}
