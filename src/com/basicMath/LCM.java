package com.basicMath;

import java.util.Scanner;
/*
We are given two numbers. The task is to find the LCM of the numbers.
LCM: Least Common Multiple

a x b = LCM(a, b) * GCD (a, b)
LCM(a, b) = (a x b) / GCD(a, b)

Input: a = 15, b = 20
Output: 60
 */
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of Two given Numbers : "+ lcmOfTwoNumbers(a,b));

    }

    private static int lcmOfTwoNumbers(int a, int b) {
        int gcd = gcdOfTwoGivenNumbers(a,b);
        return (a*b)/gcd;
    }

    private static int gcdOfTwoGivenNumbers(int a, int b) {
        if(b==0){
            return a;
        }
        return gcdOfTwoGivenNumbers(b, a%b);
    }
}
//Time Complexity O(log(min(a,b))) and Auxiliary Space O(1)