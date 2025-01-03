package com.mohanapriya;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {22,33,44,55,66,99};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start<end){
            swap(array,start,end);
            start++;
            end--;

        }
    }

    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2] = temp;

    }
}
