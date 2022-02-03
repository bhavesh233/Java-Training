package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FindFile implements Runnable{

    public void run()
    {
        try {
            FileInputStream fin = new FileInputStream("/home/pp-7/Bhavesh/JavaTraning/MultiThreading/file/test.txt");
            int i=0;
            int counter=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
                if(i==10){
                    counter++;
                }
            }
            System.out.println("Number of Line "+counter);
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


public class DirecterOfTraverse {
    public static void main(String[] args) {

        FindFile ff =new FindFile();
        Thread t1 =new Thread(ff);
        t1.start();


    }
}
