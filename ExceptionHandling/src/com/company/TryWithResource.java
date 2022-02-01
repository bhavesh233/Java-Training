package com.company;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResource {

    static Scanner sc;

    static void divide() throws Exception{

        System.out.println();


        try(FileInputStream  fi = new FileInputStream("test.txt");)
        {
            sc = new Scanner(fi);
            int a =sc.nextInt();
            int b= sc.nextInt();
            int c =sc.nextInt();
            System.out.println(a/b); // FileInputStream automatically call fi.close()
        }
    }

    public static void main(String[] args) throws Exception {
            divide();

            int x = sc.nextInt();
            System.out.println(x);

        }

}
