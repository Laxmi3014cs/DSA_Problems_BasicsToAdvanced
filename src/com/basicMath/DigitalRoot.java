package com.basicMath;

import java.util.Scanner;
/*
You are given a number n. You need to find the digital root of n. Digital Root of a number is the recursive sum of its digits until we get a single digit number.
Input: n = 99999
Output: 9
Explanation: Sum of digits of 99999 is 45 which is not a single digit number, hence sum of digit of 45 is 9 which is a single digit number.
 */
public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(efficientMethod(n)); // Time Complexity O(LogN) and Auxiliary Space O(1)
        System.out.println(mostEfficientMethod(n)); // Time Complexity O(1) and Auxiliary Space O(1)
    }

    private static int mostEfficientMethod(int n) {
        if(n<=9){
            return n;
        }else{
            return mostEfficientMethod(n%10 + mostEfficientMethod(n/10));
        }
    }

    private static int efficientMethod(int n) {
        if(n<=9){
            return n;
        }
        while(n>=10){
            int sum=0;
            while(n>0){
                int digit = n%10;
                sum += digit;
                n /=10;
            }
            n = sum;
        }
        return n;
    }
}
