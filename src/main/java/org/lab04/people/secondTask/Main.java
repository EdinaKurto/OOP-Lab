package org.lab04.people.secondTask;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);

        System.out.println("Circle Info:");
        circle.displayInfo();
        System.out.println("\nRectangle Info:");
        rectangle.displayInfo();
    }
}

