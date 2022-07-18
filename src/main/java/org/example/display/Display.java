package org.example.display;

import org.example.animal.Animal;
import org.example.animal.Dog;
import org.example.animal.Mammal;
import org.example.container.Container;

public interface Display {
    static void showAnimalData(Container<Animal> container) {
        Animal animal = container.getValue();
        System.out.println("Weight: " + animal.getWeight());
    }

    static void showMammalData(Container<Mammal> container) {
        Mammal mammal = container.getValue();
        System.out.println("Age: " + mammal.getAge() + ", weight: " + mammal.getWeight());
    }

    static void showDogData(Container<Dog> container) {
        Dog dog = container.getValue();
        System.out.println("Name: " + dog.getName() + ", age: " + dog.getAge() + ", weight: " + dog.getWeight());
    }
}
