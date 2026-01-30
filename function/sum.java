import java.util.*;

public class sum {

    public static int  calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter value of a: ");
            int a = sc.nextInt();

            System.out.print("Enter value of b: ");
            int b = sc.nextInt();

            int sum = calculateSum(a, b);
            System.out.println("The sum is: " + sum);
        }
    }
}
