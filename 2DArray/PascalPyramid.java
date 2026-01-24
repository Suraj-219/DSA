import java.util.*;

public class PascalPyramid {
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i=0; i<n; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    static void printPyramid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter n :");
            int n = sc.nextInt();

            int[][] ans = pascal(n);
            printPyramid(ans);
        }
    }
}
