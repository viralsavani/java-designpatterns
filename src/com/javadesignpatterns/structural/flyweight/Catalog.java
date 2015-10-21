package com.javadesignpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * Catalog acts as a factory and cache for Item flyweight objects
 */
public class Catalog {
    private HashMap<String, Item> items = new HashMap<>();

    //factory method
    public Item lookUp(String itemName){
        if (!items.containsKey(itemName)){
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade(){
        return items.size();
    }
}
