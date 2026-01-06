package com.Methods;

public class SCOPE {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String name = "rahul";

        {
           //int a = 78; // already initialised outside the block in the same method,hence you cannot initailised again
            int c = 99;
            a = 67; // reassign the origin ref variable to some other value
            name = "sai";
            System.out.println(name);
        }
        //System.out.println(c);
        // values intialised in this block. will ramian in block

        System.out.println(name);
        //System.out.println(marks);  // cant acess marks here//

        for (int i = 0; i < 4 ; i ++){
            System.out.println(i);
            int num = 90;
            a = 1000;
        }


    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
