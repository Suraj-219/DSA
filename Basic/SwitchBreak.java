import java.util.*;
public class SwitchBreak {
    public static void main(String[] args) {
        try(Scanner sc  = new Scanner(System.in)){
            System.out.print("Enter no: ");
            int n = sc.nextInt();

            switch(n){
                case 1: System.out.println("Hello");
                break;

                case 2: System.out.println("Namaste");
                break;

                case 3: System.out.println("India");
                break;

                case 4: System.err.println("Button Invalid");
            }
        }
    }
}
