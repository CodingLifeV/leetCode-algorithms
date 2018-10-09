package binarySearch;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class a_34 {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target);
        int last = binarySearch(nums, target + 1) - 1;
        if (nums[first] != target || first == nums.length) {
            return new int[]{-1, -1};
        } else {
            return new int[]{first, Math.max(first, last)};
        }
    }
    //查找最左元素
    private int binarySearch(int[] nums, int target) {
        int i = 0, j = nums.length ;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (nums[m] >= target ) {
                j = m;
            } else {
                i = m + 1;
            }
        }
        return i;
    }
}
