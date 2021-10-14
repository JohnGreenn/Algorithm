package com.xq.algorithm;

/**
 * 描述：
 * fileName：com.xq.algorithm
 * author：Christiano
 * time：2021/03/26 10:44
 */
public class Main {

    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 0;
        num[1] = 1;
        num[2] = 0;
        num[3] = 3;
        num[4] = 12;

        moveZeros(num);
        System.out.println(num.toString());
    }

    public static void moveZeros(int[] nums) {

        int j = 0;
        for(int i = 0; i <nums.length ; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
