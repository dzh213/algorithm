package com.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by donghao on 2017/8/11.
 */
public class StringPermutation {

    public static void main(String[] args){
        String A = "abc";
        String B = "cba";
        System.out.println(Permutation(A,B));
    }

    public static boolean Permutation(String A, String B) {
        // write your code here
        //防止length空指针，A，B为null的判断要放到前面
        if (A == null || B == null || A.length() != B.length()){
            return false;
        }
        if (A.equals(B)){
            return true;
        }
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0;i<A.length();i++){
            char a = A.charAt(i);
            if (map.containsKey(a)){
                if (map.get(a)+1 == 0){
                    map.remove(a);
                }else {
                    map.put(a,map.get(a)+1);
                }
            }else {
                map.put(a,1);
            }

            char b = B.charAt(i);
            if (map.containsKey(b)){
                if (map.get(b)-1 == 0){
                    map.remove(b);
                }else {
                    map.put(b,map.get(b)-1);
                }
            }else {
                map.put(b,-1);
            }
        }

        return map.size() == 0;
    }
}
