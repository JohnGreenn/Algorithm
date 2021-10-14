package com.xq.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc：
 * author：Christiano
 * gitee:
 * time：2021/06/11 11:26
 */
public class Offer15 {
    public static void main(String[] args) {
       int a=  hammingWeight(00000000000000000000000000001011);

    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {

        List<Integer> list = new ArrayList<>();
        String sint = String.valueOf(n);
        int index = 0;
        int[] arr = new int[sint.length()];
        for(int i = 0; i < sint.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(sint.charAt(i)));
            if(arr[i]==1){
                index++;
            }
        }
        return index;
    }
}
