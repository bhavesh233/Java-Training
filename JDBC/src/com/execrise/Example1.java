package com.execrise;



public class Example1 {

    public static void increase(int a) {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 10;
        increase(a);
        System.out.println("outside methode "+a);

    }

}
