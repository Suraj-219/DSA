import java.util.*;

public class factorial {

    public static void printFactorial(int n) {
        int product = 1;
        for(int i=1; i<=n; i++){
            product = product * i;
        }
        System.out.print("The factorial is: " + product);
        return;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter value: ");
            int n = sc.nextInt();

            printFactorial(n);
        }
    }
}
