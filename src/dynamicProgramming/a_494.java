package dynamicProgramming;

/**
 * 目标和,改变一组数的正负号使得它们的和为一给定数
 * https://blog.csdn.net/mine_song/article/details/70216562
 * https://blog.csdn.net/lby0910/article/details/72859713
 */
public class a_494 {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = computeArraySum(nums);
        if (sum < S || (sum + S) % 2 == 1) return 0;
        int W = (S + sum) / 2;
        int[] dp = new int[W+1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = W; i >= num; i--) {
                dp[i] = dp[i] + dp[i-num];
            }
        }
        return dp[W];
    }
    private int computeArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
