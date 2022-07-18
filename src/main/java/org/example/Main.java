package org.example;

import org.example.animal.Animal;
import org.example.animal.Dog;
import org.example.animal.Mammal;
import org.example.container.Container;
import org.example.display.Display;


public class Main {
    public static void main(String[] args) {
        Container<Animal> animalContainer = new Container<>();
        Container<Mammal> mammalContainer = new Container<>();
        Container<Dog> dogContainer = new Container<>();

        Animal animal = new Animal(200);
        Mammal mammal = new Mammal(73, 22);
        Dog dog = new Dog(6, 1, "Nela");

        animalContainer.setValue(animal);
        mammalContainer.setValue(mammal);
        dogContainer.setValue(dog);

        Display.showAnimalData(animalContainer);
        // Display.showAnimalData(mammalContainer); Can't compile
        // Display.showAnimalData(dogContainer); Can't compile
        Display.showMammalData(mammalContainer);
        Display.showDogData(dogContainer);
    }
}