package binarySearch;

/**
 * 寻找旋转排序数组中的最小值
 */
public class a_153 {
    public int findMin(int[] nums) {
        int i= 0, j = nums.length - 1;
        while (i < j) {
            //i不能等于j,循环到i == j时,此时的nums[i]已经是最后数组中的最小值了，不需要在进入循环中去了
            //找一个数组nums中存在的元素
            int m = i + (j - i)/2;
            if (nums[m] <= nums[j]) {
                j = m;
            } else {
                i = m + 1;
            }
        }
        return nums[i];
    }
}
