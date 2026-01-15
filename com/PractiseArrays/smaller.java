package PractiseArrays;

import java.util.Scanner;

public class smaller {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("inter the number");
        int a = input.nextInt();

        int[]nums = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for(int numbers: nums){
            if(a>numbers){
                sum += 1;
            }

        }
        System.out.println("smaller numbers are:" + sum);


               

    }
    
}
