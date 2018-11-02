package dynamicProgramming;

import java.util.Arrays;

/**
 * 零钱兑换
 * http://www.mamicode.com/info-detail-2355991.html
 * http://www.cnblogs.com/Moriarty-cx/p/9770707.html
 */
public class a_322 {
    /*
    dp[i][j] = min(dp[i-1][j], dp[i][j - coins[i]] + 1)
    表示金额数为j时，前i个硬币可以组合成金额j所需的最少硬币个数
    一维状态转移方程为:
    dp[j] = min(dp[j], dp[j-coins[i]] + 1)
     */
    public int coinChange(int[] coins, int amount) {
        if (coins == null && coins.length == 0) {
            return 0;
        }
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
