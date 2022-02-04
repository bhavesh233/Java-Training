package com.company;

import java.io.FileInputStream;

public class Example1 {

    public static void main(String[] args) throws Exception{

        String path = "/home/pp-7/Bhavesh/JavaTraning/Java IO";
        try (FileInputStream fileInputStream = new FileInputStream(path+"/File2/test1.txt")) {
            int i=fileInputStream.read();
            while (i!=-1){
                System.out.print((char)i);
                i=fileInputStream.read();
            }
        }
        System.out.println();
        // filter world less than 3

        try (FileInputStream fileInputStream = new FileInputStream(path+"/File2/test1.txt")) {
            byte []i = fileInputStream.readAllBytes();
            String str = new String(i);

            String[] arrOfStr = str.split(" ");

            int count=0;
            int numberCount=0;
            String[] minWord=new String[10];

            int minWorldLength=0;
            for (int j=0;j<arrOfStr.length;j++){
                if(arrOfStr[j].length()<=2){
                     minWord[minWorldLength]=arrOfStr[j];
                        minWorldLength++;

                }
                boolean flag =true;
               try{
                Integer.valueOf(arrOfStr[j]);
                flag =true;
               }catch (Exception e){
                   flag=false;
               }
                if(!flag){
                    count++;
                }else {
                    numberCount++;
                }
            }


            System.out.println("word is "+(count+1)+" and number is "+(numberCount));

            for (int l=0;l<minWord.length;l++){
                System.out.print("  "+minWord[l]);

                }
            }

    }
}
