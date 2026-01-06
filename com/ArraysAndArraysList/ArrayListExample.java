package com.ArraysAndArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList <Integer> list  = new ArrayList<>(10);

//
        Scanner in = new Scanner(System.in);
        // input
        for (int i = 0;i<5;i++){
            list.add(in.nextInt());
        }
        for (int i = 0;i<5;i++){
            System.out.println(list.get(i));//pass index here,list(index) syntax will not work here
        }
        //System.out.println(list);
    }
}
