package com.logins;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {

     private static Connection conn = null;

    public static Connection ConnecDb() {
       
        try {
        
         
             Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "");
//             Class.forName("org.sqlite.JDBC");
//            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\solai\\Documents\\NetBeansProjects\\Library_Management_System_Projects\\library_Management.sqlite");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
          
        }
        return conn;
    }
}
