package PractiseArrays;

import java.util.Arrays;


public class maxarray {

    int [] arr = { 1,2,34,234,2,44,36};

    int max = arr[0];

    for(int number: arr){
        if(number > max){
            max = number;
        }
    }
    System.out.println("max = " + max);


    
}
