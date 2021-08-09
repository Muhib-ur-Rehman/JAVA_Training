package com.company.databaseConnection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Records of Users :");
            ResultSet rs=ConnectingDB.establishConnection().executeQuery("select * from user");
            while (rs.next()){
                System.out.println("ID : "+rs.getString(1)+" , NAME : " + rs.getString(2)+" , Password : "+rs.getString(3)+" , Age : "+rs.getString(4));
            }
        }catch(Exception e){ System.out.println(e);}

}
}
