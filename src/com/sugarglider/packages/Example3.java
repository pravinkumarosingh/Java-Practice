package com.sugarglider.packages;

/**
 * this class is an example for static initializer
 */
public class Example3 {

    static int[] values = new int[5];

    static {
        for (int i = 0;i<values.length ; i++){
            values[i] = (int) (Math.random() * 100);
        }
    }

    public void printValues(){
        for (int value:values){
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Example3 obj1 = new Example3();
        obj1.printValues();

        Example3 obj2 = new Example3();
        obj2.printValues();
    }
}
