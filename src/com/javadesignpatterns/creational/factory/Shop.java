package com.javadesignpatterns.creational.factory;

/**
 * Created by VIRAL on 10/12/2015.
 */
class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
