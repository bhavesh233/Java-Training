package com.company;

public class Wrapper {

    public static void main(String[] args) {

        int m1= 15;
        Integer m2=15;
        Integer m3 =Integer.valueOf("15");
        int m4 =m2.intValue(); // or int m4 =m2 automaticall call

        System.out.println(m2==m1);//true
        System.out.println(m2==m3); //true
        System.out.println(m2.equals(m3)); //true

        Integer m5 =Integer.valueOf("1010",2);// declare binary
        System.out.println(m5);

        Integer m6 = Integer.valueOf("A7",16);
        System.out.println(m6);

    }
}
