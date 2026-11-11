package com.basicMath;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
Given a number n. Find its unique prime factors in increasing order.
Input: n = 60
Output: [2, 3, 5]
Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5.
 */
public class UniquePrimeFactorsInSortedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> res = uniquePrimeFactors(n);
        System.out.println(res);
    }

    private static ArrayList<Integer> uniquePrimeFactors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if(n<=1){
            return res;
        }
        while(n%2==0){
            res.add(2);
            n /=2;
        }
        while(n%3==0){
            res.add(3);
            n /=3;
        }
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            while(n%i==0){
                res.add(i);
                n /=i;
            }
            while (n%(i+2)==0){
                res.add((i+2));
                n /=(i+2);
            }
        }
        if(n>3){
            res.add(n);
        }
        return res.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
    }
}
//Time Complexity: O(sqrt(n))
//Auxiliary Space: O(1)