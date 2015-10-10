package com.javadesignpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * "This approach is functionally equivalent to the public field approach, except that it
 * is more concise, provides the serialization machinery for free, and provides an
 * ironclad guarantee against multiple instantiation, even in the face of sophisticated
 * serialization or reflection attacks. While this approach has yet to be widely
 * adopted, a single-element enum type is the best way to implement a singleton"
 * Joshua Bloch, Effective Java (2nd Edition)
 */
public enum DBSingletonEnum {
    INSTANCE;
    private Connection conn = null;

    DBSingletonEnum(){
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch (SQLException e){
            e.printStackTrace();
        }
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
