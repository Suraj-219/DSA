import java.util.*;

public class basic {
    public static void printMyName(String name) {
        System.out.print("Your name is: " + name);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            String name = sc.next();

            printMyName(name);
        }
    }
}
