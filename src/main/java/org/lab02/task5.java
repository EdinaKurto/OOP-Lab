package org.lab02;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an exponent: ");
        int exponent = scanner.nextInt();

        int sum = 0;

        while(exponent >= 0) {
            sum += (int)Math.pow(2, exponent);
            exponent--;
        }

        System.out.println("The result is: " + sum);
    }
}
