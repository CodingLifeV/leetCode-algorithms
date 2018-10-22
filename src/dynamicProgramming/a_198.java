package dynamicProgramming;

/**
 * 强盗抢劫
 */
public class a_198 {
    public int rob(int[] nums) {
        int pre1 = 0, pre2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}
