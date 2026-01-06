package com.Methods;

public class Swap {
    public static void main(String[] args) {
        // swapping the values of

        int a = 10;
        int b = 20;
//
//        int temp = a;
//        a = b;
//        b = temp;
        swap( a, b);        // this function is not able to change the values of a and b lets see why
        System.out.println(a + " " + b);

        String name = "kunal kushwaha";
        changeName(name);
        System.out.println(name);
    }
    static void swap(int a,int b ){
        int temp=a;
        a=b;
        b=temp;
    }
    static void changeName(String name){
        name = "Rahul Rana";  //creating a new object
    }
// this change will only be valid in this function scope only



}
