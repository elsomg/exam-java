package com.cdsb.zoo;

public class Animals extends Zoo{
   String name;
    String species;
    String type;         
    String food;      
    boolean survive;      
    String habitat; 
    int space;

    public Animals(String name, String species, String food, String type, boolean survive, int space) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.type=type;
        this.survive = survive;
        this.space = space;
    }

    public Animals(String string, String string2, String string3, boolean b, String animals, int i) {
    }

    public boolean Compatibility(Animals other) {
        return this.survive && other.survive &&
               this.food.equals(other.food) &&
               this.habitat.equals(other.habitat);
    }

    public static int length() {
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }
}

