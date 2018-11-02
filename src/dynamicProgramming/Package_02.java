package dynamicProgramming;

/**
 * 0-1背包空间优化
 */
public class Package_02 {
    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W+1];
        // 前 i 件物品的状态仅与前 i-1 件物品的状态有关，
        // 因此可以将 dp 定义为一维数组，其中 dp[j] 既可以表示 dp[i-1][j] 也可以表示 dp[i][j]
        for (int i = 1; i <= N; i++) {
            int w = weights[i-1], v = values[i-1];
            for (int j = W; j >= 1; j--) {
                if (j >= w) {
                    dp[j] = Math.max(dp[j], dp[j-w] + v);
                }
            }
        }
        return dp[W];
    }
}
