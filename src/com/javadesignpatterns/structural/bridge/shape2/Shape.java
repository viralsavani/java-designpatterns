package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();
}
