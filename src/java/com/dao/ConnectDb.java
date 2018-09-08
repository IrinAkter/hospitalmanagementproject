/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class ConnectDb {

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "apcl123456");
            return con;
        } catch (Exception e) {
            return null;
        }
    }

}
