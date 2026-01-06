package com.switchStatement;



import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int empID = in.nextInt();
//       String Department = in.next();
//
//       switch(empID){
//           case 1:
//               System.out.println("sam");
//               break;
//           case 2:
//               System.out.println("elon");
//               break;
//           case 3:
//               System.out.println("EMP number 3");
//               switch(Department){
//                   case "IT":
//                       System.out.println("Department IT");
//                       break;
//                   case "AI":
//                       System.out.println("Department AI");
//                       break;
//                   default:
//                       System.out.println("Department Not Found");
//               }break;
//           default:
//               System.out.println("empID Not Found");
//
//       }

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1 -> System.out.println("sam");
            case 2 -> System.out.println("elon");
            case 3 -> {
                System.out.println("EMP number 3");
                switch (Department) {
                    case "IT" -> System.out.println("Department IT");
                    case "AI" -> System.out.println("Department AI");
                    default -> System.out.println("Department Not Found");
                }
            }
            default -> System.out.println("empID Not Found");
        }

    }
}
