package org.lab02;

import java.util.Scanner;

public class task6 {
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times to print the text: ");

        int number = scanner.nextInt();

        while(number >= 0) {

            printText();
            number = number - 1;
        }
    }
}
