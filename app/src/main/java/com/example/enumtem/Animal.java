package com.example.enumtem;

public enum Animal {
    DOG(R.string.dog),
    CAT(R.string.cat),
    FROG(R.string.frog),
    RABBIT(R.string.rabbit);

    private int animal;

    Animal(int animal){
        this.animal = animal;
    }

    public int getAnimal(){
        return animal;
    }
}
