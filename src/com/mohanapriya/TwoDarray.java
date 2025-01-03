package com.mohanapriya;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
//input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scan.nextInt();
            }
        }

//output
//        for(int row=0; row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(" ");
//        }

//using string in output
//        for(int row=0; row<arr.length;row++){
//                System.out.println(Arrays.toString(arr[row]));
//            }
//    }

//using enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}