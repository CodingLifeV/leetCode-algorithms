package mathematics;

/**
 * Base 7,7进制转化
 */
public class a_504 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        boolean isNegative = num < 0;
        if (isNegative) num = -num;

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        String str = sb.reverse().toString();
        return isNegative ? "-" + str : str;

    }
}
