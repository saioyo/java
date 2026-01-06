package com.ConditionsAndLoops;

public class santa {
    public static void main(String[] args){
        /*

            Syntax of if statements:
            if (boolean expression T or F){
            //body
            } else {
            // do this
            }
        */

        int salary = 100;
//        if (salary > 1000) {
//            salary = salary + 2000;
//        }else {
//            salary =salary+ 1000;
//        }
//        System.out.println(salary);
            if (salary> 100) {
                salary += 50;
            }else if (salary>200){
                salary += 100;
            }else {
                salary += 25;

            }
                System.out.println(salary);

    }
}
