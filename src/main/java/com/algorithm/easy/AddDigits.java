package com.algorithm.easy;



/**
 * Created by donghao on 2017/8/16.
 * 各位相加返回一位整数
 */
public class AddDigits {

    public static void main(String[] args){
        int num = 38;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        while (num >= 10){
            int sum = 0;
            while (num != 0){
                int tail = num % 10;
                sum += tail;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

}
