package org.lab04.people.secondTask;


public class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public Circle(String initialColor, FillType initialFillType, double initialRadius) {
        super(initialColor, initialFillType);
        this.radius = initialRadius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * this.radius;
    }
}

