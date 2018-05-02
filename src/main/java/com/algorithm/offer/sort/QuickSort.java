package com.algorithm.offer.sort;

/**
 * Created by donghao on 2018/5/2.
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {22,4,2,8,14,3};
        quickSort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length;i++) {
            System.out.println(nums[i]);
        }
    }

    private static void quickSort(int[] nums,int left,int right) {
        if (left > right) {
            return;
        }
        int base = nums[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && base <= nums[j]) {
                j--;
            }
            while (i < j && base >= nums[i]) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        //调整base
        int temp = nums[i];
        nums[i] = nums[left];
        nums[left] = temp;
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }
}
