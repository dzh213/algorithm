package com.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by donghao on 2017/8/15.
 * 判断两个字符串是否结构相同
 */
public class StringsHomomorphism {

    public static void main(String[] args){
        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        // Write your code here
        int s1 = s.length();
        int s2 = t.length();
        if (s1 != s2){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<Character, Integer>();
        Map<Character,Integer> map2 = new HashMap<Character, Integer>();
        int[] array1 = new int[s1];
        int[] array2 = new int[s2];

        int tmp = 0;
        for (int i = 0;i<s1;i++){
            char a = s.charAt(i);
            if (map1.containsKey(a)){
                array1[i] = map1.get(a);
            }else {
                map1.put(a,tmp);
                array1[i] = tmp;
                tmp++;
            }
            System.out.println("s:" +a + "," + map1.get(a));
        }

        tmp = 0;
        for (int i = 0;i<s2;i++){
            char b = t.charAt(i);
            if (map2.containsKey(b)){
                array2[i] = map2.get(b);
            }else {
                map2.put(b,tmp);
                array2[i] = tmp;
                tmp++;
            }
            System.out.println("s:" +b + "," + map2.get(b));
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
