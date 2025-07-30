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
        if (!animal.type.equals(this.type)){
        return false;
        }
        for (Animals a : animales) {
            space += a.space;
            if (a.Compatibility(a)) {
            return true;
        }
    }

        if (space + animal.space > space) return true;
        animales.add(animal);
        return true;
    }

    
}

