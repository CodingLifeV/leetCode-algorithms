package greedy;

/**
 * 修改一个数成为非递减数组
 */
public class a_665 {
    public boolean checkPossibility(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            //索引从i=1开始,不从0开始,
            if (nums[i] >= nums[i-1]) {
                continue;
            }
            index++;
            if (i-2 >= 0 && nums[i] < nums[i-2]) {
                nums[i] = nums[i-1];
            } else {
                nums[i-1] = nums[i];
            }
        }
        return index <= 1;
    }
}
