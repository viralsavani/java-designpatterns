package com.javadesignpatterns.structural.bridge.shape1;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class BlueSquare extends Square{
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
