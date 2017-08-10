package com.algorithm.easy;

/**
 * Created by donghao on 2017/8/10.
 */
public class ReverseInteger {

    public static void main(String[] agrs){
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail)/10 != result){
                return 0;
            }
            result = newResult;
            x = x /10;
        }
        return result;
    }
}
