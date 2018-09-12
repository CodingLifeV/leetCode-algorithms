package sort;

/**
 * 荷兰国旗问题,按颜色进行排序,只有 0/1/2 三种颜色。
 * 基于三向切分快速排序
 */
public class a_75 {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                swap(nums, one, --two);
            } else {
                one++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
