package dynamicProgramming;

/**
 * 等差数列划分
 */
public class a_413 {
    /*
    dp[i] 表示以 A[i] 为结尾的等差递增子区间的个数。

    在 A[i] - A[i - 1] == A[i - 1] - A[i - 2] 的条件下，
    {A[i - 2], A[i - 1], A[i]} 是一个等差递增子区间。如
    果 {A[i - 3], A[i - 2], A[i - 1]} 是一个等差递增子区
    间，那么 {A[i - 3], A[i - 2], A[i - 1], A[i]} 也是等
    差递增子区间，dp[i] = dp[i-1] + 1。
     */
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length == 0 && A == null) {
            return 0;
        }
        int n = A.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (A[i-1]-A[i-2] == A[i]-A[i-1]) {
                dp[i] = dp[i-1] + 1;
            }
        }
        int totle = 0;
        for (int cnt : dp) {
            totle += cnt;
        }
        return totle;
    }
}
