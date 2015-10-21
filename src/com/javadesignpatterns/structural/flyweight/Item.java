package com.javadesignpatterns.structural.flyweight;

/**
 * Instance of Item will be flyWeights
 */
public class Item {
    private final String name;

    public Item(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
