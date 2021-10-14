package com.xq.offer;

public class MyClass {
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
                //形象的理解可以是i++先做别的事，再自己加1，++i先自己加1，再做别的事情。
            }
        }

        return nums;
    }
}
