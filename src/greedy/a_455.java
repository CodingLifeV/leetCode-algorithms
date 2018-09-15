package greedy;

import java.util.Arrays;

/**
 * 分发饼干
 */
public class a_455 {
    public int findContentChildren(int[] g, int[] s) {
        int gi = 0, si = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gi < g.length && si < s.length) {
            if (g[gi] <=  s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
}
