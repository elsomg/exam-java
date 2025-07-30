package com.cdsb.zoo;

public class Animals extends Zoo{
   String names;
    String species;
    String type;
    String food;
    boolean survive;
    String s;
    int space;

    public Animals(String names, String species, String food, String type, boolean survive, String s, int space) {
        this.names = names;
        this.species = species;
        this.food = food;
        this.type=type;
        this.survive = survive;
        this.s=s;
        this.space = space;
    }


    public boolean Compatibility(Animals other) {
        return this.survive && other.survive &&
               this.food.equals(other.food) &&
               this.type.equals(other.type);
    }

    public static int length() {
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }
    @Override
    public String toString() {
        return names + species +type + food +survive + s + space;

    }
}

