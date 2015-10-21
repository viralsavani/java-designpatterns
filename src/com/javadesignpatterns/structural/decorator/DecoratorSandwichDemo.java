package com.javadesignpatterns.structural.decorator;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
