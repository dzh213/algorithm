package com.algorithm.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by donghao on 2018/4/11.
 * 从尾到头依次输出
 */
public class PrintListFromTailToHead {
    class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    //递归解决
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead1(listNode.next);
            arrayList.add(listNode.value);
        }
        return arrayList;
    }

    //根据栈先进后出解决
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList list = new ArrayList();
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode.next != null) {
            stack.add(listNode.value);
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
