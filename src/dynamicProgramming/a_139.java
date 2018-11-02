package dynamicProgramming;

import java.util.List;

/**
 * 单词拆分
 * https://blog.csdn.net/parishong/article/details/72869927?utm_source=itdadao&utm_medium=referral
 * https://blog.csdn.net/qq_38595487/article/details/82431046
 */
public class a_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        //dp[i]表示前i个字符能否匹配成功
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {//i表示前i个字符
            for (int j = 0; j < i; j++) {
                //初始flags[0]=true，再从下标1开始，
                // 判断下标1之前也就是 0-0 之间是否是由字典组成的，
                // 判断下标2之前 也就是0-1是否是由字典组成的，
                // 然后3 ， 判断下标3，4，5，6，7……
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
