package com.student_management;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        // jdbc code...

        try {
            Connection con = ConnectionProvider.createConnection();
            String query = "insert into students(sname, sphone, scity) values(?,?,?)";

            // PreparedStatement
            PreparedStatement pst = con.prepareStatement(query);

            // set the values of parameters
            pst.setString(1, st.getSname());
            pst.setString(2, st.getSphone());
            pst.setString(3, st.getScity());

            // execute
            pst.executeUpdate();
            f = true;


        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
