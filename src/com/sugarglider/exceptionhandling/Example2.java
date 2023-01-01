package com.sugarglider.exceptionhandling;

public class Example2 {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }


    private static void method1() {
        method2();
        System.out.println("method 1 ended");
    }

    private static void method2() {
        try{
            String str = null;
            str.length();
            System.out.println("method 2 ended");
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
