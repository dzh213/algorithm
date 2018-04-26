package com.algorithm.offer.sort;

/**
 * Created by donghao on 2018/4/26.
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {22,4,2,8,14,3};
//        nums = bubbleSort(nums);
        nums = bubbleSort2(nums);
        for (int i = 0; i < nums.length;i++) {
            System.out.println(nums[i]);
        }
    }

    private static int[] bubbleSort2(int[] nums) {
        int length = nums.length;
        for (int i = length-1;i>0;i--) { //第一次冒泡排序就把最大的放到了最右侧
            for (int j = 0;j<i;j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    private static int[] bubbleSort(int[] nums) {
        for (int i = 0;i<nums.length;i++) {
            for (int j = 0;j < nums.length-1;j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
