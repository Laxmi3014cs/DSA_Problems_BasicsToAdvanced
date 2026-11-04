package com.basicMath;

import java.util.Scanner;
/*
We are given a number. The task is to find the factorial of the number.
The factorial (n!) of a number is the product of all the integers from 1 to that number, i.e,
n! = 1*2*3*.....(n-1)*n
 */
public class FindingFactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of a Given Number is : "+fact1(n)); // Time Complexity O(N) and Auxiliary Space O(n) due stack space
        System.out.println("Factorial of a Given Number is : "+fact2(n)); // Time Complexity (N) and Auxiliary Space O(1)
    }

    private static int fact2(int n) {
        int res=1;
        for(int i=1;i<=n;i++){
            res *=i;
        }
        return res;
    }

    private static int fact1(int n) {
        if(n==0){
            return 1;
        }
        return n* fact1(n-1);
    }
}
