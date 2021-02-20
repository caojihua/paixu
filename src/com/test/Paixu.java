package com.test;

import java.util.Arrays;

public class Paixu {

    public static void main(String[] args) {
        maopao();
    }
    /**
     * 1、冒泡排序（Bubble Sort）算法描述
     * 步骤1: 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
     * 步骤2: 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
     * 步骤3: 针对所有的元素重复以上的步骤，除了最后一个；
     * 步骤4: 重复步骤1~3，直到排序完成。
     */
    public static void maopao() {
        int[] array = {14, 9, 8, 15, 34, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
