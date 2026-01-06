package com.Methods;

import java.util.Arrays;

public class ChaneValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1,3,2,34,23,14};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]nums){
        nums[0] = 99; // if you make the change to the object via this ref variable same object will be change
    }

}
