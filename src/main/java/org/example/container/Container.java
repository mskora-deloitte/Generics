package org.example.container;

import org.example.animal.Animal;

public class Container<T extends Animal> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
