package com.mohanapriya;


import java.util.ArrayList;

public class Arraylistt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(768);
        list.add(768);
        list.add(768);
        list.add(768);
        list.add(768);
        list.add(768);
        list.add(768);
        list.add(79);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list);
        System.out.println( list.contains(79));
    }
}
