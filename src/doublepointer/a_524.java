package doublepointer;

import java.util.List;

public class a_524 {
    public String findLongestWord(String s, List<String> d) {
        String longesWord = "";//记录最长字符串
        for (String target : d) {
            int l1 = longesWord.length(), l2 = target.length();
            if(l1 > l2 || (l1 == l2 && longesWord.compareTo(target) < 0)) {
                continue;
            }
            if (isValid(s, target)) {
                longesWord = target;
            }
        }
        return longesWord;
    }
    //判断字符串是否可以通过删除给定字符串的某些字符来得到
    private boolean isValid(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}
