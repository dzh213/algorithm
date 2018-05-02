package com.algorithm.offer.sort;

/**
 * Created by donghao on 2018/4/20.
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] agrs) {
        int[] nums = {23,4,2,8,14,3};
        nums = selectSort(nums);
        for (int i = 0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }

    private static int[] selectSort(int[] nums) {
        for (int i = 0;i<nums.length;i++) {
            int min = i;        //假设当前i为最小
            for (int j = i+1;j<nums.length;j++) { //当前元素和从后面的选择出最小的
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }

            if (min != i) {     //如果最小的不是在i上，交换位置
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
        return nums;
    }
}
