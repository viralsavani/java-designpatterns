package com.javadesignpatterns.structural.flyweight;

/**
 * Created by VIRAL on 10/21/2015.
 */
public class FlyweightInventoryDemo {

    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose HeadPhones", 234);
        ims.takeOrder("Samsung TV", 543);
        ims.takeOrder("Samsung TV", 65);
        ims.takeOrder("Roomba", 56);
        ims.takeOrder("Bose HeadPhones", 83);
        ims.takeOrder("Roomba", 905);
        ims.takeOrder("Samsung TV", 34);
        ims.takeOrder("Roomba", 346);
        ims.takeOrder("Bose HeadPhones", 87);
        ims.takeOrder("Samsung TV", 367);

        ims.processOrder();

        System.out.println(ims.report());

    }
}
