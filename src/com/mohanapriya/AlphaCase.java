package com.mohanapriya;

import java.util.Scanner;

public class AlphaCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char s = scan.next().trim().charAt(0);
        if(s>='a' && s<='z'){
            System.out.println(s + " is Lowercase");
        }
        else{
            System.out.println(s + " is Uppercase");
        }

//        String s = "hello babie";
//        System.out.println(s.charAt(0));
    }
}
