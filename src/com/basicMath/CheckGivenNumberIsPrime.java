package com.basicMath;

import java.util.Scanner;
//We are given a number. The task is to check if the number is prime or not.
//Prime Number: A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
//Input:  n = 15
//Output: false
public class CheckGivenNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrimeMoreEfficientApproach(n) && isPrimeEfficientApproach(n)){
            System.out.println("Given Number is a Prime Number : "+n);
        }else{
            System.out.println("Given Number is not a Prime Number : "+n);
        }
    }

    private static boolean isPrimeEfficientApproach(int n) {
        if(n==1){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeMoreEfficientApproach(int n) {
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2 ==0 || n%3==0){
            return false;
        }
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
//Time Complexity O(Math.sqrt(N)) and Auxiliary Space O(1)