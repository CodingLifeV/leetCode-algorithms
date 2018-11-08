package mathematics;

/**
 * 计数质数
 * https://blog.csdn.net/o83290102o5/article/details/79491834
 */
public class a_204 {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (notPrimes[i]) {
                continue;
            }
            count++;
            for (int j = i * i; j < n; j += i) {
                notPrimes[j] = true;
            }
        }
        return count;
    }
}
