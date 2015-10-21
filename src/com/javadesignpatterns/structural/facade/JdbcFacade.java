package com.javadesignpatterns.structural.facade;

import com.javadesignpatterns.creational.singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class JdbcFacade {

    DBSingleton instance = null;

    public JdbcFacade(){
        instance = DBSingleton.getInstance();
    }


    public int createTable(){
        int count = 0;
        try {
            // Hiding all of this stuff i.e. creating connection, statement, closing them.
            Connection conn = instance.getConnection();
            Statement stmt = conn.createStatement();
            count = stmt.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(){
        int count = 0;
        try {
            // Hiding all of this stuff i.e. creating connection, statement, closing them.
            Connection conn = instance.getConnection();
            Statement stmt = conn.createStatement();
            count = stmt.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 Street', 'LB')");
            System.out.println(count + " record(s) inserted");
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddress(){
        List<Address> addresses = new ArrayList<>();
        try {
            // Hiding all of this stuff i.e. creating connection, statement, closing them.
            Connection conn = instance.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Address");

            Address address;
            while (rs.next()){
                address = new Address();
                address.setId(rs.getString((1)));
                address.setStreetName(rs.getString((2)));
                address.setCity(rs.getString((3)));

                addresses.add(address);
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return addresses;
    }
}

class Address{

    private String id;
    private String streetName;
    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "CityId: " + getCity() +
                ", StreetName: " + getStreetName() +
                ", City: " + getCity();
    }
}