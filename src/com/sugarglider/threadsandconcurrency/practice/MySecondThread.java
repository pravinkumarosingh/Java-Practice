package com.sugarglider.threadsandconcurrency.practice;

public class MySecondThread extends Thread {

    public void run(){
        System.out.println("inside run...");
        go();
    }

    private void go(){
        System.out.println("inside go...");
        more();
    }

    private void more(){
        System.out.println("inside more...");
    }

    public static void main(String[] args) {
        Thread thread = new MySecondThread();
        thread.start();
        System.out.println("inside main...");
    }
}
