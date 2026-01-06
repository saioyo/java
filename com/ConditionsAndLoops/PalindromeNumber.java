package com.ConditionsAndLoops;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 123345;

        int ans = 0;

        while(num>0){

            int rem = num % 10 ;

            ans = ans * 10 + rem;
            num /= 10;
        }
        System.out.println(ans);

    }
}
