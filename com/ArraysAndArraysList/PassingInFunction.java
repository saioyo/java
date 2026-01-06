package com.ArraysAndArraysList;
import java.util.Arrays;



public class PassingInFunction {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));




    }
    static void change(int[] arr){
        arr [0]= 99;
    }
}
