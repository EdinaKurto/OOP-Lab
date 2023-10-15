package org.lab02;

import java.util.Scanner;
import java.util.Random;

public class task10 {
    public static int drawNumber() {
        Random rand = new Random();
        return rand.nextInt(101);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = drawNumber();

        int counter = 0;

        while(true) {
            System.out.print("Guess the number: ");
            int number = scanner.nextInt();

            if(number == randomInt) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if(number > randomInt) {
                counter++;
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if(number < randomInt) {
                counter++;
                System.out.println("The number is greater, guesses made: " + counter);
            }
        }
    }
}