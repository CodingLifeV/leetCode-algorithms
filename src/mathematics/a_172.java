package mathematics;

/**
 * 阶乘后的零
 * https://blog.csdn.net/feliciafay/article/details/42336835
 */
public class a_172 {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
