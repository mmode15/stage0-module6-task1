package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        if (this.numberOfPaws == 1) {
            if (this.hasFur) {
                return String.format("This animal is mostly %s. It has %d paw and a fur.",
                        this.color, this.numberOfPaws);
            } else {
                return String.format("This animal is mostly %s. It has %d paw and no fur.",
                        this.color, this.numberOfPaws);
            }
        } else {
            if (this.hasFur) {
                return String.format("This animal is mostly %s. It has %d paws and a fur.",
                        this.color, this.numberOfPaws);
            } else {
                return String.format("This animal is mostly %s. It has %d paws and no fur.",
                        this.color, this.numberOfPaws);
            }
        }
    }

    public static void main(String[] args) {
        Animal dog = new Animal("red", 3, true);
        dog.getDescription();
    }
}


