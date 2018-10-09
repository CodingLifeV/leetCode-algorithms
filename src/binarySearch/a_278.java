package binarySearch;

/**
 * First Bad Version
 */
public class a_278 {
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (isBadVersion(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    //随便定义isBadVersion()
    private static boolean isBadVersion(int n){ return true;}
}
