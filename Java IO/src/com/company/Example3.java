package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Example3 {

    public static void main(String[] args) throws Exception {

        String path = "/home/pp-7/Bhavesh/JavaTraning/Java IO";
        System.out.println();

        BufferedReader bufReader = new BufferedReader(new FileReader(path + "/File2/test1.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();

        while (line != null) {
            String[] str = line.split(" ");
            for (int i = 0; i < str.length; i++) {
                listOfLines.add(str[i]);
            }
            line = bufReader.readLine();
        }

        bufReader.close();
        Collections.sort(listOfLines);
        System.out.println(listOfLines);

        HashMap<Character,Integer>  hashMap = new HashMap<>();

        int count = 0;
        Character st[] = new Character[26];
        for (String str : listOfLines) {
            count = 0;
            for (String str1 : listOfLines) {
                if (str.charAt(0) == str1.charAt(0)) {
                    count++;
                }
            }
            hashMap.put(str.charAt(0),count);
        }

        for(Map.Entry<Character,Integer> m : hashMap.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }

    }
}
