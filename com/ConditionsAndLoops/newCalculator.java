import java.util.Scanner;

public class newCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result;

            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    result = a / b;
                    break;
                case '%':
                    result = a % b;
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
