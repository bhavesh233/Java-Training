package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

    public static void main(String[] args) throws Exception{

        String path = "/home/pp-7/Bhavesh/JavaTraning/Java IO";
        try (FileInputStream fileInputStream = new FileInputStream(path+"/File2/test1.txt")) {

           int i=fileInputStream.read();
           while (i!=-1){
               System.out.print((char)i);
               i=fileInputStream.read();
           }

        }

//        File file = new File(path+"/File2/test1.txt");
//        Desktop desktop = Desktop.getDesktop();
//        desktop.open(file);

        try (FileOutputStream fileOutputStream = new FileOutputStream(path+"/File3/test2.txt")) {

           String str ="Welcome to javaTpoint Hello";

           byte b[]= str.getBytes();
           fileOutputStream.write(b);
           System.out.println("success");

        }

        Path temp = Files.move(Paths.get(path+"/File3/test2.txt"),Paths.get(path+"/File2/test5.txt"));
        if(temp!=null){
            System.out.println("moved");
        }else {
            System.out.println("not moved");
        }

    }

}
