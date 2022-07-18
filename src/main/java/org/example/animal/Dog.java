package org.example.animal;

public class Dog extends Mammal {

    private String name;

    public Dog(int weight, int age, String name) {
        super(weight, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
