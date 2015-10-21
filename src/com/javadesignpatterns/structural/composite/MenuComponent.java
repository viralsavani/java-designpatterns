package com.javadesignpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIRAL on 10/19/2015.
 */
public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent){
        return name + ": " + url + "\n";
    }
}
