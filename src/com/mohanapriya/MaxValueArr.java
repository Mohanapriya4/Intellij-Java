package com.mohanapriya;

public class MaxValueArr {
    public static void main(String[] args) {
        int[] arr = {2,7,3,8,9};
        System.out.println(max(arr));

    }
    static int max(int[] array){
         int maxVal=array[0];
         for(int i =1;i<array.length;i++){
             if(array[i]>maxVal){
                 maxVal = array[i];
             }
         }
         return  maxVal;

    }

}
