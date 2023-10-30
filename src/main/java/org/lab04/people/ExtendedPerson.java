package org.lab04.people;

public class ExtendedPerson extends Person {
    private int age;
    private String country;

    public ExtendedPerson(String initialName, String initialAddress, int initialAge, String initialCountry) {
        super(initialName, initialAddress);
        this.age = initialAge;
        this.country = initialCountry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   " + "Age: " + age + "\n   " + "Country: " + country;
    }
}

