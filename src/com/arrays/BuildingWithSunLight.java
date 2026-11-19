package com.arrays;

import java.util.Scanner;
/*
Given the array arr[] of heights of certain buildings that lie adjacent to each other, Sunlight starts falling from the left side of the buildings.
If there is a building of a certain height, all the buildings to the right side of it having lesser heights cannot see the sun. Find the total number of buildings that receive sunlight.

Note: Buildings with equal height do not block each other and can also receive sunlight.
Input: arr[] = [6, 2, 8, 4, 11, 13]
Output: 4
Explanation: Only the buildings with heights 6, 8, 11, and 13 receive sunlight; therefore, the output is 4.

 */
public class BuildingWithSunLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sunLight(arr,n));
    }

    private static int sunLight(int[] arr, int n) {
        int count =1, max_left=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] >= max_left){
                count++;
                max_left = arr[i];
            }
        }
        return count;
    }
}
//Time Complexity: O(n)
//Auxiliary Space: O(1)