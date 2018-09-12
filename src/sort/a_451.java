package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 */
public class a_451 {
    public String frequencySort(String s) {
        //map存储字符及出现频率
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //构造若干个桶
        List<Character>[] buckets = new ArrayList[s.length()+1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        //从后向前输出桶字符串
        StringBuilder builder = new StringBuilder();
        for (int i = buckets.length-1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (Character c : buckets[i]) {
                    for (int j = 0; j < i; j++)
                        builder.append(c);
                }
            }
        }
        return builder.toString();
    }
}
