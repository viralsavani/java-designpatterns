package com.javadesignpatterns.structural.facade;

import com.javadesignpatterns.creational.singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by VIRAL on 10/20/2015.
 */
public class JdbcDemo {

    public static void main(String[] args) {
        DBSingleton instance  = DBSingleton.getInstance();

        try{
            Connection conn = instance.getConnection();
            Statement stmt = conn.createStatement();

            int count;
            stmt.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table Created");
            stmt.close();


            stmt = conn.createStatement();
            count = stmt.executeUpdate("INSERT INTO Address (ID, StreetName, City) VALUES (1, '1234 Street', 'LB')");
            System.out.println(count + " record(s) created");
            stmt.close();

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Address");
            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            stmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
