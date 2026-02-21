import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentEvenElement {
     public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int ans = -1;

        // Find most frequent even element
        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = key;
            } 
            else if (freq == maxFreq && key < ans) {
                ans = key;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = mostFrequentEven(nums);

        System.out.println("Most Frequent Even Element: " + result);

        sc.close();
    }
}
