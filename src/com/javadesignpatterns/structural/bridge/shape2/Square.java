package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
