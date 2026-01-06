package com.switchStatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // WAP take fruits name input and display their feature

//        System.out.println("Enter your fruit");

        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
//
//        switch (fruit) {  // i have change the format from previous one by click switch and change to advanced switch
//
//            case "apple" -> System.out.println(" sweet red fruit");
//            case "orange" -> System.out.println(" Round fruit");
//            case "mango" -> System.out.println(" King of fruits");
//            case "grapes" -> System.out.println(" small and round purple in shapes");
//            default -> System.out.println(" Unknown fruit");
//        }
// if break is not mention below then all the execution below will perform even when finding the requird one

          int day = in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Day 1: Monday");
//            case 2 -> System.out.println("Day 2: Tuesday");
//            case 3 -> System.out.println("Day 3: Wednesday");
//            case 4 -> System.out.println("Day 4: Thursday");
//            case 5 -> System.out.println("Day 5: Friday");
//            case 6 -> System.out.println("Day 6: Saturday");
//            case 7 -> System.out.println("Day 7: Sunday");
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("Weekend");
        }



    }
}
