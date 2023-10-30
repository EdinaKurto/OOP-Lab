package org.lab04.people;
public class Teacher extends Person {
    private int salary;
    public Teacher (String initialName, String initialAddress, int initialSalary) {
        super(initialName, initialAddress);
        this.salary = initialSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   " + "Salary: " + salary + " euros/month";
    }
}
