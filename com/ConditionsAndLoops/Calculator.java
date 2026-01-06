package com.ConditionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Operator ;");
        char op = in.next().trim().charAt(0);

        int ans = 0 ;
        while(true){
            if(op == '+'|| op == '-' || op == '*'|| op == '/'|| op=='%'){
                System.out.println("Enter the numbers :");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if(op == '+'){
                    ans = n1 + n2;
                }
                if(op == '-'){
                    ans = n1 - n2;
                }
                if(op == '*'){
                    ans = n1 * n2;
                }
                if(op == '/'){
                    if (n2 != 0)
                    {
                        ans = n1 / n2;
                    }
                }
            }
        else if (op == 'x'|| op == 'X') {
            break;
        }else {
                System.out.println("Invalid Operation");
            }
        }
        System.out.print(ans);


    }
}
