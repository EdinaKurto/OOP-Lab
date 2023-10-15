package org.lab02;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print("Enter a number: ");

            int number = scanner.nextInt();

            if(number == 0) {
                break;
            }
            else
            {
                sum += number;
            }
        }

        System.out.println("The final sum is: " + sum);
    }

}

