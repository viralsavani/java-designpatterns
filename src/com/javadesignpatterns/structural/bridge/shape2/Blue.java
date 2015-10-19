package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
