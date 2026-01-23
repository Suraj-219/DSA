import java.util.Scanner;

public class SortZeroAndOne {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Array size:");
            int n = sc.nextInt();
            int[] a = new int[n];

            System.out.println("Enter the value of array:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;

            while (left < right) {
                if (a[left] == 0) {
                    left++;
                }
                else if (a[right] == 1) {
                    right--;
                }
                else {
                    swap(a, left, right);
                    left++;
                    right--;
                }
            }

            System.out.println("Sorted Zero and One:");
            for (int x : a) {
                System.out.print(x + " ");
            }
        }
    }
}
