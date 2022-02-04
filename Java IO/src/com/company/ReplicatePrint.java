package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ReplicatePrint {

    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("/home/pp-7/Bhavesh/JavaTraning/Java IO/File2/test6.txt");
            PrintStream printStream = new PrintStream(fout);
            printStream.println("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
