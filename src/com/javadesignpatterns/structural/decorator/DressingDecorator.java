package com.javadesignpatterns.structural.decorator;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        //Composition: pass the instance we are working with.
        //We are having our functionality through composition
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    private String addDressing(){
        return " + mustard";
    }
}
