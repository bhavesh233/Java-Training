package com.company;

import java.sql.*;

public class Display {
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

/*
        ResultSet rs = stmt.executeQuery("SELECT * FROM traine where traineaddress='Rajkot';");
        while (rs.next()) {
            int id = rs.getInt("traineid");
            String name = rs.getString("trainename");
            int age = rs.getInt("traineage");
            String address = rs.getString("traineaddress");
            Date joiningDate = rs.getDate("trainejoiningdob");
            Date dobDate = rs.getDate("trainedob");

            System.out.print(" ID = " + id);
            System.out.print(" NAME = " + name);
            System.out.print(" AGE = " + age);
            System.out.print(" JONINGDATE = " + joiningDate);
            System.out.print(" DOBDATE = " + dobDate);
            System.out.print(" ADDRESS = " + address);

            System.out.println();
        }
*/



/*
        ResultSet rs = stmt.executeQuery("SELECT * FROM traine WHERE traineage>=20 AND traineage<=21");
        while (rs.next()) {
            int id = rs.getInt("traineid");
            String name = rs.getString("trainename");
            int age = rs.getInt("traineage");
            String address = rs.getString("traineaddress");
            Date joiningDate = rs.getDate("trainejoiningdob");
            Date dobDate = rs.getDate("trainedob");

            System.out.print(" ID = " + id);
            System.out.print(" NAME = " + name);
            System.out.print(" AGE = " + age);
            System.out.print(" JONINGDATE = " + joiningDate);
            System.out.print(" DOBDATE = " + dobDate);
            System.out.print(" ADDRESS = " + address);

            System.out.println();
        }
*/

/*        ResultSet rs = stmt.executeQuery("SELECT * FROM traine ORDER BY  trainejoiningdob DESC");
        while (rs.next()) {
            int id = rs.getInt("traineid");
            String name = rs.getString("trainename");
            int age = rs.getInt("traineage");
            String address = rs.getString("traineaddress");
            Date joiningDate = rs.getDate("trainejoiningdob");
            Date dobDate = rs.getDate("trainedob");

            System.out.print(" ID = " + id);
            System.out.print(" NAME = " + name);
            System.out.print(" AGE = " + age);
            System.out.print(" JONINGDATE = " + joiningDate);
            System.out.print(" DOBDATE = " + dobDate);
            System.out.print(" ADDRESS = " + address);
            System.out.println();
 }*/

        ResultSet rs = stmt.executeQuery("SELECT * FROM traine ORDER BY trainedob DESC");
        while (rs.next()) {
            int id = rs.getInt("traineid");
            String name = rs.getString("trainename");
            int age = rs.getInt("traineage");
            String address = rs.getString("traineaddress");
            Date joiningDate = rs.getDate("trainejoiningdob");
            Date dobDate = rs.getDate("trainedob");

            System.out.print(" ID = " + id);
            System.out.print(" NAME = " + name);
            System.out.print(" AGE = " + age);
            System.out.print(" JONINGDATE = " + joiningDate);
            System.out.print(" DOBDATE = " + dobDate);
            System.out.print(" ADDRESS = " + address);
            System.out.println();
        }
        stmt.close();
        conn.commit();
        conn.close();
    }
}
