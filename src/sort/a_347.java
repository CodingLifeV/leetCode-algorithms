package sort;

import java.util.*;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class a_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //将数组中的值放在一个Map集合中,其中,数组中的值存放在key键中,value为该值的出现次数
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        //构造若干个桶,每个桶存储频率相同的数,桶的下标值代表出现的频率数,即第i个桶中存储的数出现的频率为i
        List<Integer>[] buckets = new ArrayList[nums.length + 1];//buckets[0]不存储数据，因为没有出现频率为0的数
        for (int key : frequencyForNum.keySet()) {
            int frequency = frequencyForNum.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        //从后向前遍历若干个桶,最先得到的k个数就是出现频率最多的的k个数。
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length-1; i >= 0 && topK.size() < k; i--) {
            if (buckets[i] != null) {
                topK.addAll(buckets[i]);
            }
        }
        return topK;
    }
}
