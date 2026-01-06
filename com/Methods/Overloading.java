package com.Methods;

public class Overloading {
    public static void main(String[] args) {

        fun(45);
        fun("sai");
        int ans = sum(34,43 ,676);
        System.out.println(ans);


    }// giving same name to the fuction cause overloading
    static void fun(int a){
        System.out.println(a);


    }
    static void fun(String name){
        System.out.println(name);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a , int b, int c){
        return a+ b+c;

    }
}
