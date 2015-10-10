package com.javadesignpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This implementation does not require synchronized block. Also it is lazy loaded by default
 * using the concept in inner class. When the singleton class is loaded, SingletonHelper class
 * is not loaded into memory and only when someone calls the getInstance method, this class
 * gets loaded and creates the Singleton class instance.
 */
public class DBSingletonBillPugh {

    private Connection conn = null;

    private DBSingletonBillPugh (){
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static DBSingletonBillPugh getInstance(){
        return SingletonHelper.instance;
    }

    public Connection getConnection(){
        if (conn == null){
            synchronized (DBSingleton.class){
                if (conn == null){
                    String url = "jdbc:derby:memory:codejava/webdb;create=true";
                    try {
                        conn = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }

    private static class SingletonHelper{
        private static final DBSingletonBillPugh instance = new DBSingletonBillPugh();
    }
}
