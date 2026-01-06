package com.ConditionsAndLoops;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 2333;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10;  // move to next digit

        }
            System.out.print(count );


        }
    }

