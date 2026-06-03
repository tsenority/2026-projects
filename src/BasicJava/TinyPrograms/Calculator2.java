package BasicJava.TinyPrograms;
import java.util.Scanner;

/* This Calculator app covers concepts of variables,operations, methods, objects creation, static/non static methods,
Menu system printing, Scanner /User input, While loop, Switch
 */

public class Calculator2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) { // while (true) concept is used for infinite loops till it breaks like menu, gaming app etc.

            System.out.println("===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            Calculator2 c = new Calculator2();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + add(a, b));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result: " + c.multiply(a, b));
                    break;

                case 4:
                    System.out.println("Result: " + c.divide(a, b));
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }

        sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

        return a / b;
    }
}
