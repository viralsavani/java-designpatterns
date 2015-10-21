package com.javadesignpatterns.structural.facade;

import java.util.List;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class JdbcFacadeDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("Table Created");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted");

        List<Address> addresses = jdbcFacade.getAddress();
        for (Address address : addresses){
            System.out.println(address.toString());
        }
    }
}
