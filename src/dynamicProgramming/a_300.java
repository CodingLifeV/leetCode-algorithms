package dynamicProgramming;

/**
 * 最长递增子序列
 */
public class a_300 {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int index = binarySearch(tails, len, num);
            tails[index] = num;
            if (index == len) {
                len++;
            }
        }
        return len;
    }
    private int binarySearch(int[] tails, int len, int key) {
        int l = 0, h = len;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (tails[mid] == key) {
                return mid;
            } else if (tails[mid] > key) {
                //错误h = mid - 1;
                //查找 Si 位于 tails 数组的位置
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
