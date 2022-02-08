package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

        static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
        static final String USER = "postgres";
        static final String PASS = "123456";

        public static void main(String[] args) throws Exception {
            // Open a connection
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
//
            System.out.println("Opened database successfully");

            stmt = conn.createStatement();
            String sql = "CREATE TABLE Traine " +
                    "(TraineID SERIAL  PRIMARY KEY     NOT NULL," +
                    " TraineName          VARCHAR ( 50 )    NOT NULL, " +
                    " TraineJoiningDob    DATE   NOT NULL, " +
                    " TraineDob           DATE    NOT NULL, " +
                    " TraineAge            INT     NOT NULL, " +
                    " TraineAddress        CHAR(50) )";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        }
}
