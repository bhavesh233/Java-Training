package com.company;

public class RemoveSpace {

    public static void main(String[] args) {

        StringBuffer removeSpace = new StringBuffer("  HELLO WORLD   ");
        String str = removeSpace.toString();
        str = str.trim();
        removeSpace.replace(0,removeSpace.length(),str);
        System.out.println(removeSpace);


    }
}
