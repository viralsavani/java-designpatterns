package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
