package org.lab02;

import java.util.Scanner;

public class task7 {
    public static void printStars(int amount) {
        String star =  "";

        while(amount >= 0) {
            star += "*";
            amount--;
        }

        System.out.println(star);
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}