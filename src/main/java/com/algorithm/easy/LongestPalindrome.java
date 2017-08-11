package com.algorithm.easy;

import java.util.HashSet;

/**
 * Created by donghao on 2017/8/11.
 * 最长回文字符串
 */
public class LongestPalindrome {

    public static void main(String[] agrs){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        // Write your code here
        if (s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> hashSet = new HashSet<Character>();
        int count = 0;
        for (int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            if (hashSet.contains(a)){
                hashSet.remove(a);
                count++;
            }else {
                hashSet.add(a);
            }
        }
        if (hashSet.isEmpty()){
            return count * 2;
        }
        return count * 2 + 1;
    }
}
