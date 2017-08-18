package com.algorithm.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by donghao on 2017/8/18.
 * 快乐树：各个位平方和最终为1
 */
public class HappyNumber {
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (n != 1){
            int sum = 0;
            while (n != 0){
                int tail = n % 10;
                sum  += (tail * tail);
                n /=10;
            }

            if (set.contains(sum)){
                return false;
            }else {
                set.add(sum);
            }
            n = sum;
        }
        return true;
    }
}
