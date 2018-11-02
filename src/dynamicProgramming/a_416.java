package dynamicProgramming;

/**
 * 划分数组为和相等的两部分
 * https://www.cnblogs.com/shinning/p/6027743.html
 * https://www.cnblogs.com/fengziwei/p/7755865.html
 * https://blog.csdn.net/mebiuw/article/details/52765840
 */
public class a_416 {
    public boolean canPartition(int[] nums) {
        int sum = computeArraySum(nums);
        if (sum % 2  != 0) return false;
        sum /=  2;
        /*int[] dp = new int[sum+1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j]  =Math.max(dp[j], dp[j-nums[i]] + nums[i]);
            }
        }
        return dp[sum] == sum;*/
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j-nums[i]];
            }
            if (dp[sum]) return true;
        }
        return false;
    }
    private int computeArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
