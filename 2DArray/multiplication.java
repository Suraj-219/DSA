import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter rows and columns of matrix 1:");
            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] a = new int[m][n];
            System.out.println("Enter matrix 1 values:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter rows and columns of matrix 2:");
            int p = sc.nextInt();
            int q = sc.nextInt();

            int[][] b = new int[p][q];
            System.out.println("Enter matrix 2 values:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            if (n != p) {
                System.out.println("Matrices cannot be multiplied");
            } else {
                int[][] res = new int[m][q];
                System.out.println("Resultant Matrix:");

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < q; j++) {
                        for (int k = 0; k < n; k++) {
                            res[i][j] += a[i][k] * b[k][j];
                        }
                        System.out.print(res[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
