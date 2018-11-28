package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 无重叠区间
 */
public class a_435 {
    public int eraseOverlapIntervals(Interval[] intervals) {
        //将intervals数组中元素按end排序
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                //if (o1.end > o2.end) return 1;
                //else if (o1.end < o2.end) return -1;
                //else return 0;
                return o1.end - o2.end;
            }
        });
        //nowEnd记录Interval类的end
        int nowEnd = intervals[0].end;
        //num记录需要删除的元素
        int num = 0;

        //遍历intervals
        for (int i = 1; i < intervals.length; i++) {
            if (nowEnd <= intervals[i].start) {
                nowEnd = intervals[i].end;
                continue;
            }
            num++;
        }
        return num;
    }
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
}
