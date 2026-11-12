package com.basicMath;

import java.util.Scanner;

//Given two integers a and b in the form of strings. Return the last digit of a^b
/*
Constraints:
1 ≤ a.size(), b.size() ≤ 1000
a and b consist only of numeric digits ('0' - '9')
a and b do not contain any leading zeros, except when number itself is "0"
Input: a = "6", b = "2"
Output: 6
Explanation: 62 = 36. Last digit is 6.
 */
public class LastDigitOfAPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int res = lastDigit(a,b);
        System.out.println("Last digit of " +a+"^"+b+" is "+ res);
    }

    private static int lastDigit(String a, String b) {
        if(a.equals("1") || b.equals("0")){
            return 1;
        }
        int modValue = moduloFunction(4,b);
        int exponent = modValue ==0 ?4:modValue;
        int res = (int)Math.pow(a.charAt(a.length()-1)-'0', exponent);
        return res%10;
    }

    private static int moduloFunction(int i, String b) {
        int res =0;
        for(int j=0;j<b.length();j++){
            res = (res*10 + b.charAt(j)-'0')%i;
        }
        return res;
    }
}
//Time Complexity O(B) and Auxiliary Space O(1)