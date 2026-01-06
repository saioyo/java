package com.ArraysAndArraysList;


import java.util.Scanner;
import java.util.Arrays;

public class Input2 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
//
//        int[] arr  = new int [5];
//        arr [0] = 1;
//        arr [1] = 2;
//        arr [2] = 3;
//        arr [3] = 4;
//        arr [4] = 5;
//        System.out.println(arr[0]);
        //[1,2,3,4,5]
//
//         // Taking input
//        for (int i =0 ; i < arr.length;i++){
//            arr [i] = in.nextInt();
//
//        }
//        // printing output
//        for (int i = 0;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        for (int num : arr){// for every element in array print the element
//            System.out.print(num + " ");
//        }// here num represents element of array

//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[5];
        for (int i = 0 ; i  < str.length ;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "sam";
        System.out.println(Arrays.toString(str));
    }
}
