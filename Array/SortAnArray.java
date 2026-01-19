import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        int[] nums = {5, 1, 1, 2, 0, 0};
        SortAnArray obj = new SortAnArray();
        int[] result = obj.sortArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (map.getOrDefault(i, 0) > 0) {
                nums[index++] = i;
                map.put(i, map.get(i) - 1);
            }
        }

        return nums;
    }
}
