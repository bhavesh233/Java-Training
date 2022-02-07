package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static void calculate(Date date1, Date date2) {

        if (date1.compareTo(date2) > 0) {
            if (date1.getMonth() == date2.getMonth() && (date1.getYear() == date2.getYear()) && (date1.getMonth() == date2.getMonth())) {
                int day = date1.getDay() - date2.getDay();
                System.out.println("fine " + day * 15)
                ;
            } else if (date1.getMonth() > date2.getMonth() && (date1.getYear() == date2.getYear())) {
                int month = date1.getMonth() - date2.getMonth();
                System.out.println("fine is " + month * 500);
            } else {
                int year = date1.getYear() - date2.getYear();
                System.out.println("fine is " + year * 10000);
            }
        } else {
            System.out.println("no fine");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("retunDate : ");
        String returnDate = sc.nextLine();
        System.out.println("acttullyRetunDate : ");
        String acttullyRetunDate = sc.nextLine();
        try {
            SimpleDateFormat sdformat = new SimpleDateFormat("dd MM yyyy");
            Date d1 = sdformat.parse(returnDate);
            Date d2 = sdformat.parse(acttullyRetunDate);
            calculate(d1, d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
