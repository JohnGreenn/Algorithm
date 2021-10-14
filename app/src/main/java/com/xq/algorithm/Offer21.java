package com.xq.algorithm;

/**
 * Desc：
 * author：Christiano
 * gitee:
 * time：2021/04/16 11:16
 */
public class Offer21 {

    public static void main(String[] args) {

        //exchange([1,2,3,4]);
        int data[] = new int[4];
        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;



        data = exchange(data);

    }



    public static int[] exchange(int[] nums) {


        int j = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i]%2!=0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }

        return nums;
    }
}
