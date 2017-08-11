package com.algorithm.easy;

/**
 * Created by donghao on 2017/8/11.
 */
public class PalindromeNumber {

    public static void main(String[] args){
        int num = 12321;
        System.out.println(palindromeNumber(num));
    }
    public static boolean palindromeNumber(int num) {
        // Write your code here
        int temp = num;
        int result = 0;
        while (num != 0){
            int tail = num % 10;
            int newResult = result * 10 + tail;

            result = newResult;
            num = num/10;
        }
        return result == temp;
    }
}
