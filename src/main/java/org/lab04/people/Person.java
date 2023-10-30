package org.lab04.people;

public class Person {
    private String name;
    private String address;

    public Person(String initialName, String initialAddress) {
        this.name = initialName;
        this.address = initialAddress;
    }

    @Override
    public String toString() {
        return name + "\n   " + address;
    }
}

