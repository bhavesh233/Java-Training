package com.company;

public class Reverse {
    public static void main(String[] args) {

        String str = "HELLO";
        int count=0;
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
           rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
