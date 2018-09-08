package doublepointer;

public class a_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while (i < j) {
            int num = numbers[i] + numbers[j];
            if (num == target) {
                return new int[]{i+1,j+1};
            } else if (num > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
        //throw new IllegalArgumentException("");
    }
}
