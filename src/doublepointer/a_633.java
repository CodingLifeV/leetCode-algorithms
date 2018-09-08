package doublepointer;

public class a_633 {
    public boolean judgeSquareSum(int c) {
        int i = 1, j = (int) Math.sqrt(c);
        while (i <= j) { //i<=j
            int result = i*i + j*j;
            if (result == c) {
                return true;
            } else if (result < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
