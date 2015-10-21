package com.javadesignpatterns.structural.decorator;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
