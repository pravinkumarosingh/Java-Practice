/**
 * try with resources example.
 */

package com.sugarglider.exceptionhandling;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int a[] = {1,2,3,4,5};
            int b = scanner.nextInt(a[5]);
            System.out.println(b);
        }
    }
}
