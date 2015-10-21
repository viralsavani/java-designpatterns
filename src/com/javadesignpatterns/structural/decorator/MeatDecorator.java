package com.javadesignpatterns.structural.decorator;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
