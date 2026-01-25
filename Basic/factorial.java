import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter no: ");
            int n = sc.nextInt();
            int product = 1;

            for(int i=1; i<=n; i++){
                product = product * i;
            }
            System.out.println("The factorial is: " + product);
        }
    }
}
