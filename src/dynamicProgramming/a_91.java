package dynamicProgramming;

/**
 * 解码方法,分割整数构成字母字符串
 * https://segmentfault.com/a/1190000003813921
 * https://blog.csdn.net/racaljk/article/details/79337727
 */
public class a_91 {
    /*
    共有三种情况：
    （1）s[i-2]和s[i-1] 两个字符是10----26之间但不包括10和20这两个数时，
        有两种编码方式，比如23------>[“BC”，“W”]，所以dp[i] = dp[i-1]+dp[i-2]
    （2）s[i-2]和s[i-1] 两个字符10或20这两个数时，有一种编码方式，
        比如10------>[“J”], 所以dp[i] = dp[i-2]
    （3）s[i-2]和s[i-1] 两个字符不在上述两种范围时，编码方式为零，
        比如27，比如01，所以dp[i] = dp[i-1]
     */
    public int numDecodings(String s) {
        if(s.length() == 0) return s.length();
        int[] dp = new int[s.length() + 1];
        // 初始化第一种解码方式
        dp[0] = 1;
        // 如果第一位是0，则无法解码
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= s.length(); i++){
            // 如果字符串的第i-1位和第i位能组成一个10到26的数字，说明我们可以在第i-2位的解码方法上继续解码
            if(Integer.parseInt(s.substring(i-2, i)) <= 26 && Integer.parseInt(s.substring(i-2, i)) >= 10){
                dp[i] += dp[i - 2];
            }
            // 如果字符串的第i-1位和第i位不能组成有效二位数字，在第i-1位的解码方法上继续解码
            if(Integer.parseInt(s.substring(i-1, i)) != 0){
                dp[i] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }
}
