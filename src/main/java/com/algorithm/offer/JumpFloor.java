package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/13.
 * 青蛙跳台阶（变形的斐波那契）
 * 如果先跳一个台阶，还剩下n-1个台阶，需要f(n-1)种跳法
 * 如果先跳两个台阶，还剩下n-2个台阶，需要f(n-2)种跳法
 * 所以f(n) = f(n-1) + f(n-2)
 */
public class JumpFloor {
    public static int JumpFloor(int target) {
        if (target < 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int result = 0;
        for (int i = 3;i<=target;i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
