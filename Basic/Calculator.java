import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter value of 1st number: ");
            int a = sc.nextInt();

            System.out.print("Enter value of 2nd number: ");
            int b = sc.nextInt();

            System.out.println("Addition is: " + (a + b));
            System.out.println("Subtraction is: " + (a - b));
            System.out.println("Multiplication is: " + (a * b));

            if (b != 0) {
                System.out.println("Division is: " + (a / b));
                System.out.println("Modulo is: " + (a % b));
            } else {
                System.out.println("Division and Modulo not possible (division by zero)");
            }
        }
    }
}

