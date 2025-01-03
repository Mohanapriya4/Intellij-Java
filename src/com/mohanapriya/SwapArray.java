package com.mohanapriya;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {22,33,44,55,66,99};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2] = temp;

    }
}
