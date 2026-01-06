package com.Methods;

import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        fun(2, 3, 4, 5, 654, 3, 5, 43, 3, 4, 333, 44);
        multiple(567, 4, "sam", "elon", "pandya");

        demo(1, 23, 4, 5, 6);
        demo("sai", "rahul", "rana", "chaddha");
        //demo() erro cannot be done when overridding//

    }
    static void multiple(int a,int b,String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
