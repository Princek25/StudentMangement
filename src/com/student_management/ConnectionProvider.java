package com.student_management;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection con;

    public static Connection createConnection() {

        try {
            //1. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. create the connection
            String user = "root";
            String password = "mysql!159";
            String url = "jdbc:mysql://localhost:3306/student_manage";
            con = DriverManager.getConnection(user, password, url);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
