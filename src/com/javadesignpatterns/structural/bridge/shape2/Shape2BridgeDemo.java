package com.javadesignpatterns.structural.bridge.shape2;

/**
 * Created by VIRAL on 10/18/2015.
 */
public class Shape2BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();

        // NOw if we want ot add new color we only need to create a new Color not new Shape, as was with Shape1.
        // i.e. Abstraction is independent of implementation


    }



}
