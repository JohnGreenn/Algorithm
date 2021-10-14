package com.xq.offer;

import java.util.Arrays;

/**
 * desc：
 * author：Glq
 * time：2021/10/14 14:47
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,9,5,6,8,6,7};
        System.out.println("待排序数据:" + Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后数据:" + Arrays.toString(arr));
    }

    private static void selectSort(int[] a) {

        //int min =
        for(int i = 0; i < a.length -1; i++) {
            //默认把数据的第一个元素当做最小值
            int minIndex = i;

            for(int j = i+1; j < a.length; j++) {
                if(a[minIndex] > a[j]){
                    //如果有比最小值小的，把当前index赋值给最小值
                    minIndex = j;
                }
            }
            if (minIndex != i) {//如果最小索引和当前遍历的索引一样，则不需要交换位置
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

        }

    }
}
