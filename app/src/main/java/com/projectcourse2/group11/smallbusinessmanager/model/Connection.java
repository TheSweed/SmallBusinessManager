package com.projectcourse2.group11.smallbusinessmanager.model;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Bjarni on 19/04/2017.
 */

public class Connection {

     public java.sql.Connection connect() {
        // should get the owners login to access the server
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/Bjarni";
            // private String url = "jdbc:mysql://IpAddress:3306/Servername";
            String user = "root";
            String password = "hallo mamma";
            Class.forName(driver);

            java.sql.Connection myConnection = DriverManager.getConnection(url, user, password);
            System.out.print("Connected");
            return myConnection;

        } catch (SQLException e) {
            System.out.print("not connected");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}