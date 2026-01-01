package com.sai;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter a temperature in degree C : ");
        float tempC = in.nextFloat();

        float tempF = (tempC *  9/5) + 32;

        System.out.println(tempF);
    }
}
