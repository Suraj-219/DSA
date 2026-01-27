import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter row & coloumn: ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int arr[][] = new int[r][c];
            System.out.println("Enter matrix: ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("The Transpose is: ");

            for(int j=0;j<c;j++){
                for(int i=0;i<r;i++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
