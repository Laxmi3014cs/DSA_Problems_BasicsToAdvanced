package com.basicMath;

import java.util.Scanner;
/*
Given two integers n and m representing the dimensions of a chessboard, find the number of ways to place one black knight and one white knight on the chessboard
such that they cannot attack each other.
Note:
The knights have to be placed on different squares.
A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped).
The knights attack each other if one can reach the other in one move.
Input: n = 2, m = 3
Output: 26
Explanation: There are 26 ways we can place a black and a white Knight on this chessboard such that they cannot attack each other.
 */
public class NonAttackingBlackAndWhiteKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = countNonAttacking(n,m);
        System.out.println(res);
    }

    private static int countNonAttacking(int n, int m) {
        long totalSquares = (long)n*m;
        long totalWays = totalSquares * (totalSquares-1);
        long attackWays =0;
        if(n>=2 && m>=3){
            attackWays += 4L*(n-1)*(m-2);
        }
        if(m>=2 && n>=3){
            attackWays += 4L*(n-2)*(m-1);
        }
        return (int)(totalWays - attackWays);
    }
}
//Time Complexity O(1) And Auxiliary Space O(1)
/*
Approach: Total arrangements − Attacking arrangements
For an n × m chessboard:

1. Total ways to place one black and one white knight on different squares:
(n*m)*(n*m-1)

2. Each knight can attack another knight in 8 possible directions.
3. The number of attacking pairs of squares is:

2(n-1)(m-2)+2(n-2)(m-1)


Each attacking pair can have two arrangements because the knights have different colours (black and white).
 */