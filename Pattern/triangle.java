import java.util.*;

public class triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        int[][] dp = new int[height + 1][height + 1];

        for (int i = height - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j) +
                    Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        triangle obj = new triangle();

        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(6, 5, 7));
        input.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(obj.minimumTotal(input));
    }
}

