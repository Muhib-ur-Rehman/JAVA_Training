package com.company.studentDetails;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingDB {

    public static Statement establishConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","123456");
        Statement stmt=con.createStatement();
        return stmt;
    }
}
