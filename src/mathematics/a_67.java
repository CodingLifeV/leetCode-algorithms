package mathematics;

/**
 * 二进制求和
 */
public class a_67 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0 && a.charAt(i--) == '1') carry++;
            if (j >= 0 && b.charAt(j--) == '1') carry++;
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
