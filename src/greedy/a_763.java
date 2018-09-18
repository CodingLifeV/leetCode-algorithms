package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 划分字母区间
 */
public class a_763 {
    public List<Integer> partitionLabels(String S) {
        int lastIndexOfChar[] = new int[26];
        //返回字符在字符串中最后一次出现的索引下标
        for (int i = 0; i < S.length(); i++) {
            lastIndexOfChar[char2Index(S.charAt(i))] = i;
        }

        List<Integer> partition = new ArrayList<>();
        int firstIndex = 0;
        while (firstIndex < S.length()) {
            int lastIndex = firstIndex;
            for (int i = firstIndex; i < S.length() && i <= lastIndex; i++) {
                int index = lastIndexOfChar[char2Index(S.charAt(i))];
                if (index > lastIndex) {
                    lastIndex = index;
                }
            }
            partition.add(lastIndex - firstIndex + 1);
            firstIndex = lastIndex + 1;
        }
        return partition;
    }
    private int char2Index(char c) {
        return c - 'a';
    }
}
