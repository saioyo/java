package PractiseArrays;

import java.util.Scanner;
import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println(" inter the number toa :");
    int a = sc.nextInt();


    ArrayList<Integer> nums = new ArrayList<>();

    
    for(int i = 1; i <= a ; i++   ){
         nums.add(i);
    }
    System.out.println(nums);
}   
}
