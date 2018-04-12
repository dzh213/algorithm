package com.algorithm.offer;

import java.util.LinkedList;

/**
 * Created by donghao on 2018/4/12.
 * 两个队列实现栈
 * 思路：
 * 始终保持一个队列是空的
 * 入栈：谁空就塞到哪个队列
 * 出栈：将有元素的队列一个个塞到另一个空队列中，直到最后一个元素直接弹出
 */
public class TwoQueueToStack {
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();

    public void push(int value) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(value);
            return;
        }
        if (queue1.isEmpty()) {
            queue2.add(value);
            return;
        }
        if (queue2.isEmpty()) {
            queue1.add(value);
            return;
        }
    }

    public Integer pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return null;
        }else if (queue1.isEmpty()) {
            //queue1为空，queue2不为空，将2中的元素取出并放入到1中，剩下一个弹出返回
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }else if (queue2.isEmpty()) {
            //queue1不为空，queue2为空
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return null;
    }
}
