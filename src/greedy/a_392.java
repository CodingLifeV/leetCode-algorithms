package greedy;

/**
 * public int IndexOf (char value, int startIndex);
 * 从指定位置startIndex返回字符value第一次在字符串中出现的索引值，如果找不到则返回-1
 */

public class a_392 {
    /*public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            char m = s.charAt(i);
            char n = t.charAt(j);
            if (m == n) {
                i++;
            }
            j++;
        }
        return i >= s.length();
    }*/
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index+1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}
