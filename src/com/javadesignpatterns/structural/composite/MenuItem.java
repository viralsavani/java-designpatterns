package com.javadesignpatterns.structural.composite;

/**
 * Created by VIRAL on 10/19/2015.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
