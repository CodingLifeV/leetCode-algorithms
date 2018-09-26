package binarySearch;

/**
 * Sqrt(x)
 */
public class a_69 {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int i = 1, j = x;
        while (i <= j) {
            int mid = i + (j-i)/2;
            int sqrt = x / mid;
            if (sqrt > mid) i = mid + 1;
            else if (sqrt < mid) j = mid - 1;
            else return mid;
        }
        /**
         * 判断返回i还是j:
         * while循环跳出之后i > j , sqrt(8) = 2.8...返回的不是3而是2 ，
         * 返回i和j中较小的一个元素，因此return j
         */
        return j;
    }
}
