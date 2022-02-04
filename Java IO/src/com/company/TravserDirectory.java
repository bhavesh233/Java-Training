package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TravserDirectory {

    public static void main(String[] args) {

        String filePath = "/home/pp-7/Bhavesh/JavaTraning/Java IO/File";

        File f = new File(filePath);

        String list[] = f.list();

        for (String list1:list){

            try (FileInputStream fileInputStream = new FileInputStream(filePath+"/"+list1)) {

                int i=fileInputStream.read();
                int count =0;
                while (i!=-1)
                {
                        if(i==10){
                            count++;
                        }
                    i=fileInputStream.read();
                }

                System.out.println(list1+" line "+count);
                System.out.println();

            }catch (Exception e){
                System.out.println("errpr "+e);
            }
        }

    }
}
