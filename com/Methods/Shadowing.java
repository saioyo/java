package com.Methods;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;//declaring
        //System.out.println(x); // error here before initialising using the vlaur
         x = 40;// initialising
        // lower level is upper ridding the upper level
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }

}
