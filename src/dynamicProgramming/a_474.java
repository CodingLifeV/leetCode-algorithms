package dynamicProgramming;

/**
 * 一和零,字符构成最多的字符串
 * http://blog.chinaunix.net/xmlrpc.php?r=blog/article&uid=31422160&id=5785047
 * https://blog.csdn.net/tstsugeg/article/details/53612011
 */
public class a_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs.length == 0 && strs == null) {
            return 0;
        }
        int[][] dp = new int[m+1][n+1];
        for (String str : strs) {
            int zeros = 0, ones = 0;
            for (char c : str.toCharArray()) {
                if (c == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
