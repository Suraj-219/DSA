import java.util.*;

public class reverse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter no: ");
            int n = sc.nextInt();
            int ans = 0;

            while(n>0){
                ans = ans * 10 + n % 10;
                n /= 10;
            }
            System.out.print("Rverse of this number is: " + ans);
        }
    }
}
