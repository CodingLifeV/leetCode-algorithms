package mathematics;

import java.util.Arrays;

/**
 * 数组中出现次数多于 n / 2 的元素
 */
public class a_169 {
    public int majorityElement(int[] nums) {
        /*
        先对数组排序，最中间那个数出现次数一定多于n/2
         */
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
