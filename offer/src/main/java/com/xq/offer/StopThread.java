package com.xq.offer;

import java.util.concurrent.TimeUnit;

/**
 * Desc：
 * author：Christiano
 * gitee:
 * time：2021/06/29 15:20
 */
public class StopThread {

    public static void main(String[] args) throws InterruptedException{
        MoonRunner runnable = new MoonRunner();
        Thread thread = new Thread(runnable,"MoonThread");
        thread.start();
        TimeUnit.MILLISECONDS.sleep(20);
        thread.interrupt();
    }

    public static class MoonRunner implements Runnable {

        private long i;

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()) {
                i++;
                System.out.println("i=" + i);
            }
            System.out.println("stop");
        }
    }
}
