package com.mohanapriya;

import java.util.Arrays;

public class ArraysInFunc {
    public static void main(String[] args) {
        int[] num = {22,44,33};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr){
      arr[0] = 99;
    }
}
