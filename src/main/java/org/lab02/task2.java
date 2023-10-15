package org.lab02;

import java.util.Scanner;

class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Type the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Type the second number: ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("Sum: " + sum);
    }
}

