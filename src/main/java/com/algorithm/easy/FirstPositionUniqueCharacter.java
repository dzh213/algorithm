package com.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by donghao on 2017/8/14.
 * 找出第一个不重复的字符
 */
public class FirstPositionUniqueCharacter {

    public static void main(String[] agrs){
        String s = "lovelintcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (int i = 0;i<s.length();i++){
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
