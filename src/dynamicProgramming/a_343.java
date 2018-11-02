package dynamicProgramming;

/**
 * 分割整数的最大乘积
 */
public class a_343 {
    /*
    自顶向下的思考：第i个数对应拆分结果为，j*{(i-j)的拆分结果} 和 j*(i-j)的最大值。
    得到了对应的状态转移方程：dp(i) = Max(j*(i-j),j*dp(i-j))其中j=（1到i-1）
     */
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        //dp[i]表示正整数i的最大乘积
        for (int i = 2; i <= n; i++) {
            //dp[i]=max{dp[i-1]*1,dp[i-2]*2,...,dp[i-(i-1)]*(i-1)}
            for (int j = 1; j <= i-1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
            }
        }
        return dp[n-1];
    }
}
