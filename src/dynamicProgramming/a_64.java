package dynamicProgramming;

/**
 * 矩阵的最小路径和
 */
public class a_64 {
    /*
     * 使用动态规划，定义 dp[M][N] ,
     * M ,N 分别代表矩阵的行和列数 dp[i][j] 表示从左上角到矩阵（i，j）
     * 位置是的最短路径和。则可知 到（i，j）位置有两种情况：1）由（i-1，j）向下走，
     * 2）由（i，j-1）向右走，所以dp[i][j]=Math.min（dp[i-1][j],dp[i][j-1]）+m[i][j];
     * 对于dp[0][j] 只能由 dp[0][j-1] 向右走，dp[i][0] 只能由 dp[i-1][0] 向下走。
     * 所以 dp[0][j]=dp[0][j-1]+m[0][j], dp[i][0]=dp[i-1][0]+m[i][0].
     */
    public int minPathSum01(int[][] grid) {
        if (grid == null) return 0;
        int m = grid.length, n = grid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int j = 1; j < n; j++) {
            //第一行只能由左向右
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            //第一列只能由上向下
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
    /*
    解法1中使用dp数组的空间大小为M*N，
    其实可以对dp数组的空间压缩至N，定义大小为N的dp数组，
    对于第一行，dp[i]=dp[i-1]+m[0][i],在求第二行中的 dp[i]
    时可以覆盖第一行 dp[i] ,第二行dp[i]=Math.min（dp[i],dp[i-1]）+m[i][j]。
     */
    public int minPathSum02(int[][] grid) {
        int[] dp = new int[grid[0].length];
        dp[0] = grid[0][0];
        for (int j = 1; j < grid[0].length; j++) {
            //求出第一行的dp
            dp[j] = dp[j-1] + grid[0][j];
        }
        for (int i = 1; i < grid.length; i++) {
            //dp[0]代表每一行最左边的dp
            dp[0] = grid[i][0] + dp[0];
            //后一行的dp覆盖前一行的dp
            for (int j = 1; j < grid[0].length; j++) {
                dp[j] = Math.min(dp[j-1]+grid[i][j], dp[j]+grid[i][j]);
            }
        }
        return dp[grid[0].length-1];
    }
}
