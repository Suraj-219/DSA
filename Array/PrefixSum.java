import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n]; 

            System.out.print("Enter " + n + " elements: ");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1; i<n; i++){
                arr[i] = arr[i] + arr[i-1];
            }
            System.out.println("Prefix Sum Array: " + Arrays.toString(arr));
        }
    }
}
