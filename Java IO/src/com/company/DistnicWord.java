package com.company;

import java.io.FileInputStream;

public class DistnicWord {

    public static void main(String[] args) throws Exception {
        String path = "/home/pp-7/Bhavesh/JavaTraning/Java IO";

        try (FileInputStream fileInputStream = new FileInputStream(path+"/File2/test1.txt")) {
            int i=fileInputStream.read();
            while (i!=-1){
                System.out.print((char)i);
                i=fileInputStream.read();
            }
        }
        System.out.println();


        try (FileInputStream fileInputStream = new FileInputStream(path + "/File2/test1.txt")) {
            byte[] i = fileInputStream.readAllBytes();
            String str = new String(i);
            String[] arrOfStr = str.split(" ");


            int countDistnicWord=0;
            int countDistnicNumber=0;

            for (int j=0;j<arrOfStr.length;j++) {


                boolean flag = true;
                try {
                    Integer.valueOf(arrOfStr[j]);

                } catch (Exception e) {
                    flag = false;
                }
                int distincCount=0;
                if (!flag) {
                    for (int k=j;k<arrOfStr.length;k++){
                       if( arrOfStr[j].equals(arrOfStr[k])){
                            distincCount++;
                       }
                    }
                    if(distincCount<2){
                    countDistnicWord++;}
                } else {
                    for (int k=j;k<arrOfStr.length;k++){
                        if( arrOfStr[j].equals(arrOfStr[k])){
                            distincCount++;
                        }
                    } if(distincCount<2){
                    countDistnicNumber++;}
                }

            }

            System.out.println("Distinc word count "+countDistnicWord+" distnic number is "+countDistnicNumber);
        }
    }



}
