package dynamicProgramming;

/**
 * 数组区间和
 */
public class a_303 {
    private int[] sums;
    public a_303(int[] nums) {
        sums = new int[nums.length+1];
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i-1] + nums[i-1];
        }
    }
    //求区间i~j的和，可以转换为sum[j+1]-sum[i]，其中sum[i]为0~i-1的和。
    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
