package mathematics;

import java.util.Arrays;

/**
 * 最少移动次数使数组元素相等II
 */
public class a_462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = 0, h = nums.length - 1;
        int move = 0;
        while (l <= h) {
            move += nums[h] - nums[l];
            l++;
            h--;
        }
        return move;
    }
}
