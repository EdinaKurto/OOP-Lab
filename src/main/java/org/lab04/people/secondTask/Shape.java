package org.lab04.people.secondTask;

public class Shape {
    private String color;
    private FillType fillType;

    public Shape(String initialColor, FillType initialFillType) {
        this.color = initialColor;
        this.fillType = initialFillType;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + fillType);
    }

    public double getArea() {
        return 0;
    }
}

