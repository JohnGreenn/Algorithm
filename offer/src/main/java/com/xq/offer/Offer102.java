package com.xq.offer;



/**
 * Desc：青蛙跳跃问题
 * author：Christiano
 * gitee:
 * time：2021/06/02 11:21
 */
public class Offer102 {

    public static void main(String[] args) {
        System.out.println(numWays(2));
    }

    public static int numWays(int n) {
        int a = 1,b = 2, sum = 0;
        if(n==0) return 1;
        if(n==1) return 2;
        for(int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

}
