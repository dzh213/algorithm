package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/13.
 * 斐波那契数列
 * f(n) = f(n-1)+f(n-2)
 * 循环O(n)必递归O(n^2)效率要高递归重复次数太多
 */
public class Fibonacci {
    public static int Fibonacci(int n) {
        int prePreNum = 0;
        int preNum = 1;
        int result = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2;i<=n;i++) {
            result = preNum + prePreNum;
            prePreNum = preNum;
            preNum = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
}
