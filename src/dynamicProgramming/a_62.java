package dynamicProgramming;

import java.util.Arrays;
/*
这是一道典型的动态规划问题，使用一个二维数组ans记忆到达每一点可行的走法总数。
首先将左边界点和上边界点初始化为1，因为机器人起始与（0，0），
左边界点和上边界点的走法只有1种。接下来的每一点（x,y），可以
由（x-1，y）向右走或是（x,y-1）向下走来到达，因此在（x,y）
这一点可到达的方法有ans[x-1][y]+ans[x][y-1]种，到达终点的方法则是ans最后一个点的数据。
 */
public class a_62 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
}
