package org.example.animal;

public class Mammal extends Animal {

    private int age;

    public Mammal(int weight, int age) {
        super(weight);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
