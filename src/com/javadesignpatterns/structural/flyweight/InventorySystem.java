package com.javadesignpatterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by VIRAL on 10/21/2015.
 */
public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String orderName, int orderNumber){
        Item item = catalog.lookUp(orderName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void processOrder(){
        for (Order order : orders){
            order.processOrder();
            orders.remove(order);
        }
    }

    String report(){
        return "\nTotal Item Objects made are "+catalog.totalItemsMade();
    }
}
