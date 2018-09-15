package test;

import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //String S = "ababcbacadefegdehijhklij";
        String S = "bbb";
        int[] lastIndexsOfChar = new int[26];
        for (int i = 0; i < S.length(); i++) {
            lastIndexsOfChar[char2Index(S.charAt(i))] = i;
        }
        for (int i : lastIndexsOfChar) {
            System.out.println(i);
        }
    }
    public static int char2Index(char c) {
        return c - 'a';
    }
}
