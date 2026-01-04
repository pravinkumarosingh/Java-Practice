package com.sugarglider.packages;

import com.sugarglider.javanewfeatures.Example;

/**
 * this class is an example for instance initializer
 */

public class Example4 {

    public Example4 () {
        System.out.println("inside no arg constructor");
    }

    public  Example4(int a){
        System.out.println("inside parameterized constructor");
    }

    {
        System.out.println("inside instance initializer");
    }

    public static void main(String[] args) {
        Example4 example4 = new Example4();
    }

}
