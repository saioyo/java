package com.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }
    // return the value

        static int sum2() {
            Scanner in = new Scanner(System.in);


            System.out.print("Enter number1: ");
            int n1 = in.nextInt();
            System.out.print("Enter number2: ");
            int n2 = in.nextInt();

            int sum = n1 + n2;
            return (sum);
        }

            static void sum() {
                Scanner in = new Scanner(System.in);
                int n1, n2, sum;

                System.out.print("Enter number1: ");
                n1 = in.nextInt();
                System.out.print("Enter number2: ");
                n2 = in.nextInt();

                sum = n1 + n2;
                System.out.println("Sum is: " + sum);
            }
    }




