package dynamicProgramming;

/**
 * 0-1背包
 * https://www.cnblogs.com/hapjin/p/5818418.html
 */
public class Package_01 {
    public int knapsack(int W, int  N, int[] weights, int[] values) {
    //dp[i][j]表示:在背包最大承重为j时，可选的物品件数有i件的情况下，背包装下的物品的最大价值
        int[][] dp = new int[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i-1], v = values[i-1];
            for (int j = 1; j <= W; j++) {
                if (j < w) {
                    //最大承重j小于第i件物品的重量，第i件物品不放入背包
                    dp[i][j] = dp[i-1][j];
                } else {
                    //第i件物品放入背包,此时取
                    // 剩余背包容量j-w可以装下的物品的最大价值与第i件物品的价值之和dp[i-1][j-w] + v
                    //与第i件物品不装入背包的最大价值二者最大值
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w] + v);
                }
            }
        }
        return dp[N][W];
    }
}
