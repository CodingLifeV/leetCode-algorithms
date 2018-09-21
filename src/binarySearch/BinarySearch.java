package binarySearch;

/**
 * 二分查找：有序的序列，每次都是以序列的中间位置的数来与待查找的关键字进行比较，
 * 每次缩小一半的查找范围，直到匹配成功
 * 注意：针对有序序列
 */
public class BinarySearch {
    public int binarySearch01(int[] nums, int key) {
        int lo = 0, hi = nums.length-1;
        while (lo <= hi) {
            int mid = lo + (lo + hi)/2;
            if (nums[mid] > key) hi = mid - 1;
            else if (nums[mid] < key) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    //二分查找可以有很多变种，变种实现要注意边界值的判断。
    // 例如在一个有重复元素的数组中查找 key 的最左位置的实现如下：
    public int binarySearch02(int[] nums, int key) {
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] >= key) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
