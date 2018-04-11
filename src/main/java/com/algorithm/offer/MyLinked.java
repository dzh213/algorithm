package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/11.
 * 实现链表
 */
public class MyLinked {
    private Node root;
    class Node {
        String value;
        Node next;
        public Node(String value) {
            this.value = value;
        }
    }

    public void insert(String value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //插入到指定位置
    public void insert(String value,int index) {
        int length = size();
        if (index > length || index < 1) {
            System.out.println("索引不合法");
            return;
        }
        Node newNode = new Node(value);
        Node temp = root;
        int i = 0;
        while (temp.next != null) {
            i++;
            if (i == index) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public int size() {
        int length = 0;
        Node temp = root;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public boolean delete(int index) {
        int length = 0;
        if (index < 1 || index > length) {
            System.out.println("索引不合格");
            return false;
        }
        Node temp = root;
        int i = 0;
        while (temp.next != null) {
            if (++i == index) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
