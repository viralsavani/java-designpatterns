package com.javadesignpatterns.structural.bridge.shape1;

/**
 * Problems: Here what if we want to add new color, we have to add new class. Or worst what if we want to add new shape
 * Look @package shape2 for solution
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}
