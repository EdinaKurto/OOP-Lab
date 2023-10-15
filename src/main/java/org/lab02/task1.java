package org.lab02;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secret = "The TV remote is in the fridge.";
        String correctpassword = "KENAI";

        while(true) {

            System.out.print("Enter the password: ");
            String password = scanner.nextLine();

            if(password.equals(correctpassword)) {
                System.out.println("Correct");
                break;
            }
            else
            {
                System.out.println("Wrong!");
            }


        }
        System.out.println("The secret is: " + secret);

    }
}