package com.algorithm.easy;

/**
 * Created by donghao on 2017/8/17.
 * 左填充
 */
public class LeftPad {
    public static void main(String[] args){
        String originalStr = "foo";
        int size = 5;
        System.out.println(leftPad(originalStr,size));
        System.out.println(leftPad("1",size,"0"));
    }
    static public String leftPad(String originalStr, int size) {
        return leftPad(originalStr,size," ");
    }



    static public String leftPad(String originalStr, int size, String padChar) {
        int length = originalStr.length();
        int num = size - length;

        for (int i = 0;i < num;i++){
            originalStr = padChar+originalStr;
        }
        return originalStr;
    }
}
