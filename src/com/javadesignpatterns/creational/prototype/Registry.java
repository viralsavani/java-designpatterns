package com.javadesignpatterns.creational.prototype;

import java.util.HashMap;

public class Registry {

    private HashMap<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item itemBean = null;

        try{
            itemBean = (Item) items.get(type).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return itemBean;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Movie1");
        movie.setPrice(29.99);
        movie.setRuntime("3 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Book1");
        book.setPrice(12.99);
        book.setNumberOfPages(367);
        items.put("Book", book);
    }
}
