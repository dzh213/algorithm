package com.algorithm.easy;

/**
 * Created by donghao on 2017/8/16.
 * 将数组中的0移到后面
 */
public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != 0){
                nums[temp++] = nums[i];
            }
        }
        for (;temp<nums.length;temp++){
            nums[temp] = 0;
        }
    }
}
