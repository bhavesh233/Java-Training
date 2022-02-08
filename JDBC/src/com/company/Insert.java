package com.company;

import java.sql.*;

public class Insert {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "123456";

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        System.out.println("Opened database successfully");
        conn.setAutoCommit(false);
        stmt = conn.createStatement();
        String sql = "INSERT INTO traine (trainename,trainejoiningdob,trainedob,traineage,traineaddress) "
                + "VALUES ('Paul','2001-08-04','2005-01-05',10, 'Rajkot'),('Rahul','2011-08-04','2015-01-05',12, 'Jamnager')";
        stmt.executeUpdate(sql);
//
        sql = "INSERT INTO traine (trainename,trainejoiningdob,trainedob,traineage,traineaddress) "
                + "VALUES ( 'Allen','2002-05-11','2015-10-02',15, 'Ahmedabad' )";

//        sql ="CREATE INDEX salary_index ON traine (traineage)";

        stmt.executeUpdate(sql);




        stmt.close();
        conn.commit();
        conn.close();
    }
}
