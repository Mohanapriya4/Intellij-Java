package com.mohanapriya;

import java.util.Scanner;

public class ArraysTopic {
    public static void main(String[] args) {
        //basic syntax
        //datatype reference = new datatype[size]
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
//        arr[0]=3;
//        arr[1]=45;
//        arr[2]=55;
//        arr[3]=83;
//        arr[4]=900;
        System.out.println(arr[3]);
        //for loop using arrays
        for (int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //using for each instead of for loop
        //syntax: datatype new reference: old reference
        for(int num:arr){
            System.out.print(num + " ");
        }



    }
}
