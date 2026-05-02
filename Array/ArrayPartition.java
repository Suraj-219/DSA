import java.util.*;

public class ArrayPartition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println("Array size must be even");
                return;
            }

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println(arrayPairSum(nums));
        }
    }

    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}