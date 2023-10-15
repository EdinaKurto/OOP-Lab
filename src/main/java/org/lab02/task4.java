package org.lab02;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the last number1: ");
        int lastNumber = scanner.nextInt();

        if (firstNumber < lastNumber) {

            while(firstNumber <= lastNumber) {
                System.out.println(firstNumber);
                firstNumber = firstNumber + 1;
            }
        }
    }
}
