package mathematics;

public class Gcd_Lcm {
    //最大公约数
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    //最小公倍数
    //最小公倍数为两数的乘积除以最大公约数。
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
