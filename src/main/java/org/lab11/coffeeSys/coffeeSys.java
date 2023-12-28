package org.lab11.coffeeSys;

import java.util.ArrayList;
import java.util.List;

class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee() {
        toppings = new ArrayList<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void showDetails() {
        System.out.println("Coffee Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}

interface CoffeeBuilder {
    void buildType();
    void buildSize();
    void buildToppings();
    Coffee getCoffee();
}

class EspressoBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public EspressoBuilder() {
        coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Espresso");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Small");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Whipped Cream");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}

class LatteBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public LatteBuilder() {
        coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Caramel Syrup");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}

class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder) {
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}

class Main {
    public static void main(String[] args) {
        CoffeeDirector director = new CoffeeDirector();

        EspressoBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getCoffee();
        System.out.println("Espresso Coffee:");
        espresso.showDetails();
        System.out.println();

        LatteBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getCoffee();
        System.out.println("Latte Coffee:");
        latte.showDetails();
    }
}
