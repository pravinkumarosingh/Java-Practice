package com.sugarglider.packages;

/**
 * this class is an example for Math class present in the java.lang package.
 *
 */
public class Example2 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        double random = Math.random();
        int winner = (int)(random * 100) + 1;
        System.out.println(random);
        System.out.println("the winner is:- " + winner);

        //round() method ~ rounding the number to nearest integer
        long distance1 = Math.round(24.45);
        int distance2 = Math.round(24.5f);

        System.out.println("distance1:- " + distance1);
        System.out.println("distance2:- " + distance2);

        //ceil - round-up
        double ceil1 = Math.ceil(24.45);
        double ceil2 = Math.ceil(25.0);

        System.out.println("ceil1 - " + ceil1);
        System.out.println("ceil2 - " + ceil2);

        //floor - round-down
        double floor1 = Math.floor(24.45);
        double floor2 = Math.floor(25.0);

        System.out.println("floor1 - " + floor1);
        System.out.println("floor2 - " + floor2);

        //max() method - returns the maximum number of two
        double maxNo = Math.max(24.45, 24.5);
        System.out.println("Maximum number:- " + maxNo);

        //abs() method - returns the positive number even if the negative number is supplied.
        double absolute = Math.abs(-24.45);
        System.out.println("absolute:- " + absolute);

        double power = Math.pow(24.0,2);
        System.out.println("power:- " + power);

        //sqrt(double a) method returns the square root of the given number.
        double squareRoot = Math.sqrt(4);
        System.out.println("square root:- " + squareRoot);

        //cbrt(double a) method returns the cube root of a number.
        double cubeRoot = Math.cbrt(8.0);
        System.out.println("cube root:- " + cubeRoot);
    }
}
