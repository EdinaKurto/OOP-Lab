package org.lab04.people;

public class Student extends Person {
    private int credits;

    public Student(String initialName, String initialAddress) {
        super(initialName, initialAddress);
        this.credits = 0;
    }

    public int credits () {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   " + "Credits: " + credits;
    }
}

