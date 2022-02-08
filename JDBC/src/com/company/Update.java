package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

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

        String sql;

//            sql="UPDATE traine SET trainename='Ravi' WHERE traineid=1";
//            stmt.executeUpdate(sql);
        sql = "UPDATE traine SET trainename='Hi1' WHERE trainejoiningdob BETWEEN CURRENT_DATE - INTERVAL '12 months' AND CURRENT_DATE - INTERVAL '6 months'";
        stmt.executeUpdate(sql);
//            sql ="UPDATE traine SET trainename='HI' WHERE trainedob='2015-10-02'";
//            stmt.executeUpdate(sql);
//            sql = "DELETE from traine where trainename LIKE 's%n'";
//            stmt.executeUpdate(sql);

        stmt.close();
        conn.commit();
        conn.close();
    }
}


