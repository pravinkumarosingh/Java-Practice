package com.sugarglider.threadsandconcurrency.practice;

public class MyThirdThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EmailCampaign());
        Thread t2 = new Thread(new DataAggregator());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.setName("EmailCampaign");
        t2.setName("DataAggregator");

        t1.start();
        t2.start();

        try{
            t2.join();
        } catch (InterruptedException exception){
            System.out.println(exception);
        }
        System.out.println("Inside main...");
    }
}
