package org.lab04.people.secondTask;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String initialColor, FillType initialFillType, double initialWidth, double initialHeight) {
        super(initialColor, initialFillType);
        this.width = initialWidth;
        this.height = initialHeight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return width * height; //testing
    }
}

