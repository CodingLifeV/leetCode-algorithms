package dynamicProgramming;

/**
 * 最长公共子序列
 */
public class LengthOfLCS {
    public int lengthOfLCS(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        //dp[i][j]dp[i][j]表示S1的前i个字符与S2的前j个字符最长公共子序列的长度
        //dp[1][1]来存储
        int[][] dp = new int[n1+1][n2+1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n1][n2];
    }
}
