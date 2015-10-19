package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
