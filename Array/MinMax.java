public class MinMax {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};

        while (nums.length > 1) {
            int[] arr = new int[nums.length / 2];

            for (int i = 0; i < nums.length; i += 2) {
                int idx = i / 2;

                if (idx % 2 == 0) {
                    arr[idx] = Math.min(nums[i], nums[i + 1]);
                } else {
                    arr[idx] = Math.max(nums[i], nums[i + 1]);
                }
            }

            nums = arr; 
        }

        System.out.println(nums[0]); 
    }
}