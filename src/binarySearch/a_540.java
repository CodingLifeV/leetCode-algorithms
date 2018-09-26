package binarySearch;

/**
 * 有序数组中的单一元素
 */
public class a_540 {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) { //lo < hi, 可用三个数的数组去判断不能lo == hi
            int mid = lo + (hi - lo) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid+1]) {
                lo = mid + 2;// 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            } else {
                hi = mid;
            }
        }
        /**
         * 判断return返回值是nums[lo]还是nums[hi] :
         * while循环每次nums[mid] == nums[mid+1]表示此位置元素是非单一元素，
         * 最后一次lo的位置则是单一元素
         */
        return nums[lo];
    }
}
