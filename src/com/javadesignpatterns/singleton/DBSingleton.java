package com.javadesignpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A simple singleton class to get the database connection
 */
public class DBSingleton {
    private static DBSingleton instance = null;
    private Connection conn = null;

    /**
     * Private constructor to prevent instantiating from outside this class
     */
    private DBSingleton(){
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * A public method to expose the instance of DBSingleton. This method is threadsafe and instance is lazy loaded.
     */
    public static DBSingleton getInstance(){
        if (instance == null) {
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
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
}
