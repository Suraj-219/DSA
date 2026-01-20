import java.util.*;

public class input {
    public static void main(String[] args) {
        try(Scanner sc  = new Scanner(System.in)){
            int rows = sc.nextInt();
            int coloums = sc.nextInt();

            int numbers [][] = new int[rows][coloums];

            for(int i=0;i<rows;i++){
                for(int j=0;j<coloums;j++){
                    numbers[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<rows;i++){
                for(int j=0;j<coloums;j++){
                    System.out.print(numbers[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
