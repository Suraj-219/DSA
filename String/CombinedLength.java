import java.util.*;

public class CombinedLength {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of strings: ");
            int size = sc.nextInt();
            sc.nextLine();

            String[] array = new String[size];
            int totalLength = 0;

            System.out.println("Enter strings:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextLine(); 
                totalLength += array[i].length();
            }

            System.out.println("Combined length = " + totalLength);
        }
    }
}
