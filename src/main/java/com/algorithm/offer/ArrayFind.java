package com.algorithm.offer;

/**
 * Created by donghao on 2018/4/10.
 * 二维数组查找
 */
public class ArrayFind {
    public static void main(String[] args) {
        int target = 7;
        int[][] array = {{1,2,8,9},
                        {2,4,9,12},
                        {4,7,10,13},
                        {6,8,11,15}};
        boolean exist1 = binarySearch(target,array);
        boolean exist2 = find(target,array);
        System.out.print(exist2);
    }

    //从左下角或右上角查找
    private static boolean find(int target, int[][] array) {
        int row = 0;
        int col = array.length;
        while (row < array.length-1 && col > 0) {
            if (target > array[row][col]) {
                row++;  //target大于array中的元素，那么target比在此元素所在行的下面，因为从左到右是递增的，从上到下也是递增的，
                        //此方法是从右上角开始查找的，所以行++，而不是列++
            }else if (target < array[row][col]) {
                col--;  //target小于array中的元素，那么target必在此元素所在列的左边
            }else {
                return true;
            }
        }
        return false;
    }

    //二分查找法
    private static boolean binarySearch(int target, int[][] array) {
        for (int i=0;i<array.length;i++) {
            int low = 0;
            int hig = array[i].length-1;
            while (low <= hig) {
                int mid = (low+hig)/2;
                if (target > array[i][mid]) {
                    low = mid + 1;
                }else if (target < array[i][mid]) {
                    hig = mid - 1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
