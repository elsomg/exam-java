package com.cdsb.zoo;

import java.util.ArrayList;

public class Habitat extends Zoo{
    String type;
    int space;
    ArrayList<Animals> animales = new ArrayList<>();

    public Habitat(String type, int space) {
        this.type = type;
        this.space = space;
    }

    public boolean addAnimal(Animals animal) {
        if (animal.habitat.equals(this.type)) 
        return true;

        for (Animals a : animales) {
            space += a.space;
            if (a.Compatibility(a)) 
            return false;
        }

        if (space + animal.space > space) return false;
        animales.add(animal);
        return true;
    }

    public void showAnimals() {
        System.out.println("Habitat (" + type + "):");
        for (Animals a : animales) {
            System.out.println(" " + a.name + " " + a.species);
        }
    }
}

