package com.epam.mjc.stage0;

public class Bird extends Animal {

    private int wings;

    public Bird() {
        super("blue", 2, false);
        this.wings = 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Moreover, it has %d wings and can fly.", this.wings);
    }
}
