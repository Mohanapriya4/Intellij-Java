package com.mohanapriya;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        //Find the largest number among three
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);
        //another solution:
        int max = Math.max(Math.max(a,b),c);
        System.out.println(max);


    }
}
