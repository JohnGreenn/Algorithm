package com.xq.offer;

import java.util.Arrays;

/**
 * Desc：
 * author：Christiano
 * gitee:
 * time：2021/06/02 14:16
 */
public class Offer111 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minArray(arr));
    }


    public static int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
