import java.util.*;

public class SortEvenOdd {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Array size :");
            int n = sc.nextInt();
            int [] arr = new int[n];

            System.out.println("Enter the value of array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n-1;

            while(left < right){
                if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] % 2 == 0){
                    left++;
                }
                if(arr[right] % 2 == 1){
                right--;
                }
            }
            System.out.println("Sorted Even and Odd :");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }
}
