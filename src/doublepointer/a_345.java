package doublepointer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class a_345 {
    //Set最重要属性用来查询归属性。使用contains()方法
    //HashSet专门对快速查询进行了优化
    private static final HashSet set = new HashSet(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        //之前想将字符串放在一个字符数组中，在进行左右遍历
        //以下方法：不提前用字符串s初始化字符数组，而是通过set集合查询元素之后逐步初始化arr数组
        char[] arr = new char[s.length()];
        while (i <= j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (!set.contains(left)) {
                arr[i++] = left;
            } else if (!set.contains(right)) {
                arr[j--] = right;
            } else {
                arr[i++] = right;
                arr[j--] = left;
            }
        }
        return new String(arr);
    }
}
