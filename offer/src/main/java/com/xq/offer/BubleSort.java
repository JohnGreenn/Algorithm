package com.xq.offer;

import java.util.Arrays;

/**
 * desc：冒泡排序
 * author：Glq
 * time：2021/10/12 14:17
 */
public class BubleSort {

    public static void main(String[] args) {

        //define need sort arry
        int[] arr = new int[]{1,5,7,6,0,2,3,9,4,8};
        System.out.println(Arrays.toString(arr));
        //sort
        bubsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubsort(int[] arr) {

        //拿到这个问题，我们先思考一下一共比较数组的长度减去一次，因为第一个和第二个开始比较
        for(int i = 0; i < arr.length - 1 ; i++) {
            //然后每一个数字需要比较次数为，8，7，6 ...
            for(int j = 0; j < arr.length - 1 - i; j++) {
                //让当前的数字和它后面的数字进行比较，如果当前的数字比后面的数字大的话，则交换位置。
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
