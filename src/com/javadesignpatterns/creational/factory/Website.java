package com.javadesignpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory patter is parameter driven
 * Solves complex creations
 * Opposite of Singleton
 */
abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages(){
        return pages;
    }

    public abstract void createWebsite();
}
