package binarySearch;

/**
 * 寻找比目标字母大的最小字母
 */
public class a_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0, j = letters.length - 1;
        while (i <= j) {
            int mid = i + (j-i)/2;
            if (letters[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        /**
         * 判断返回letters[i]还是letters[j] :
         * 找比target大的最小字母,判断条件letters[mid] <= target每次更新i值小于等于target,
         * 最后一次的i（此时i>j）刚刚大于target,是比target大的最小字母
         */
        return i < letters.length ? letters[i] : letters[0];
    }
}
