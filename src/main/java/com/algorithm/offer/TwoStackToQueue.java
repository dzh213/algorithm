package com.algorithm.offer;

import java.util.Stack;

/**
 * Created by donghao on 2018/4/12.
 * 使用两个栈实现一个队列
 * 思路：
 * 入队：始终使用stack1 push
 * 出队：如果stack2为空的，那么stack1中所有元素弹出，放入到stack2中，pop弹出最新的，
 *      如果stack2不为空，则直接pop最新的
 */
public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int value) {
        stack1.push(value);
    }
    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                int value = stack1.pop();
                stack2.push(value);
            }
        }
        return stack2.pop();
    }
}
