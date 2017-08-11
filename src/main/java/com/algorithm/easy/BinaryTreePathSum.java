package com.algorithm.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by donghao on 2017/8/11.
 * 二叉树的路径和
 */
public class BinaryTreePathSum {
    class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null){
            return result;
        }
        Stack<Integer> stack = new Stack<Integer>();
        binaryTreePathSum(result,stack,root,0,target);
        return result;
    }

    private void binaryTreePathSum(List<List<Integer>> result, Stack<Integer> stack, TreeNode root, int sum, int target) {
        sum += root.val;
        stack.push(root.val);
        if (sum == target && root.left == null && root.right == null){
            List<Integer> list = new ArrayList<Integer>(stack);
            result.add(list);
            stack.pop();//递归和栈类似，后进先出，会先执行最后一个递归函数
            return;
        }else {
            if (root.left != null){
                binaryTreePathSum(result,stack,root.left,sum,target);
            }
            if (root.right != null){
                binaryTreePathSum(result,stack,root.right,sum,target);
            }
            stack.pop();
        }
    }
}
