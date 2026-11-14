package com.basicMath;

import java.util.Scanner;
/*
You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.
Input: n = 6
Output: true
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.
 */
public class CheckPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPerfect(n));
    }

    private static boolean checkPerfect(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += i;
                if(sum >n){
                    return false;
                }
            }
        }
        return sum == n;
    }
}
//Time Complexity O(N) and Auxiliary Space O(1)