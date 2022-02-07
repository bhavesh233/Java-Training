package com.company;

import java.io.FileInputStream;

public class WordStart {


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



                for (int j=0;j<arrOfStr.length;j++) {

                    boolean flag = true;
                    try {
                        Integer.valueOf(arrOfStr[j]);

                    } catch (Exception e) {
                        flag = false;
                    }


                    if(!flag) {
                        char ch = (char) arrOfStr[j].charAt(0);
                        int count = 0;
                        for (int k = 0; k < arrOfStr.length; k++) {
                            if (ch == arrOfStr[k].charAt(0)) {
                                count++;
                            }
                        }
                        System.out.println(ch+" count "+count);
                    }

                }

                }
            }

}
