package com.xq.offer;

import javax.sound.midi.Soundbank;

/**
 * Desc：
 * author：Christiano
 * gitee:
 * time：2021/05/07 9:57
 */
public class Offer101 {

    public static void main(String[] args) {

        int a = fib(5);
    }


    public static int fib(int n) {

        if(n < 2)
            return n;

        int first = fib(n-1) % 1000000007;
        int second = fib(n-2) % 1000000007;

        return first+second;
    }

}
