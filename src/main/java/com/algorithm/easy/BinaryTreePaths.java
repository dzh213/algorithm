package com.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by donghao on 2017/8/18.
 * 二叉树的所有路径
 */
public class BinaryTreePaths {
    class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root != null){
            search(root,list,"");
        }
        return list;
    }

    private void search(TreeNode root, List<String> list, String path) {

        if (root.left == null && root.right == null){
            list.add(path+root.val);
        }
        if (root.left != null){
            search(root.left,list,path+root.val+"-->");
        }
        if (root.right != null){
            search(root.right,list,path+root.val+"-->");
        }
    }
}
