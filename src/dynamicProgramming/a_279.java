package dynamicProgramming;

import java.util.Arrays;

/**
 * 按平方数来分割整数
 */
public class a_279 {
    /*
    采用动态规划实现。用 dp[i] 数组存储第 i 个数的完美平方数。
    递推式为：dp[i] = Math.min(dp[j] + dp[i-j], dp[i]，认为
    i 的完全平方数是从和为 i 的两个完全平方数 dp[j] 和 dp[i-j]
    之和，然后从中取最小。
     */
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 1;
        for (int i = 1; i <= n; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt*sqrt == i) dp[i] = 1;
            else {
                for (int j = 1; j <= i/2; j++) {
                    dp[i] = Math.min(dp[i], dp[j]+dp[i-j]);
                }
            }
        }
        return dp[n];
    }
    /*
    所有的数都可以看做一个普通数加上一个完美平方数，
    那么递推式就变为了：dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j])，
     */
    public int numSquaresPro(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 0; i * i <= n; i++)
            dp[i * i] = 1;
        for(int i = 1; i <= n; i++) {  //选定第一个数为 i
            for(int j = 1; i + j * j <= n; j++) {  //选定另一个数为 j*j
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);  //从小到大查找
            }
        }
        return dp[n];
    }

}
