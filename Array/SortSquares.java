import java.util.*;

public class SortSquares {

    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Array size: ");
            int n = sc.nextInt();

            int [] arr = new int[n];
            System.out.print("Enter the value of array: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n-1;
            int[] ans = new int[n];
            int k = n-1; 

            while(left <= right){
                if(Math.abs(arr[left]) > Math.abs(arr[right])){
                    ans[k--] = arr[left] * arr[left];
                    left++;
                } else {
                    ans[k--] = arr[right] * arr[right];
                    right--;
                }
            }
            System.out.println("Sorted squares: ");
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i] + " ");
            }
        }
    }
}
