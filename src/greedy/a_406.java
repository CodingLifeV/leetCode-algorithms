package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 根据身高重建队列(h, k)
 * Arrarlist中的add(int index,Object ojb)方法,
 * 在list中下标index的位置添加元素obj,下标index及其之后的元素后移
 */
public class a_406 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        //身高h降序排列，k值升序
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        //重新排列
        List<int[]> list = new ArrayList<>();
        for (int[] a : people) {
            list.add(a[1], a);
        }

        return list.toArray(new int[list.size()][]);
    }
}
