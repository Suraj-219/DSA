import java.util.*;

public class search {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter row & col: ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int numbers[][] = new int[r][c];
            System.out.println("Enter matrix: ");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    numbers[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter value to search: ");
            int x = sc.nextInt();

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(numbers[i][j] == x){
                        System.out.println("x found at location("+i+","+j+")");
                    }
                }
            }
        }
    }
}
