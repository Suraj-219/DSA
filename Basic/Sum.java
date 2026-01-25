import java.util.*;

public class Sum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();

            int sum = a + b;
            System.out.println("The value of sum is: " + sum);
        }
    }
}
