package com.sugarglider.threadsandconcurrency.practice;

public class MyFourthThread {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setBalance(100);

        Thread john = new Thread(bankAccount);
        Thread anita = new Thread(bankAccount);

        john.setName("John");
        anita.setName("Anita");

        anita.setPriority(Thread.MAX_PRIORITY);

        john.start();
        anita.start();

        //System.out.println(Thread.currentThread().getName());


    }
}
