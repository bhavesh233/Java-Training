package com.execrises;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(10);
        al1.add(50);

        al2.add(100);
        al2.add(200);
        al2.add(20);
        al2.add(12);
        al2.add(10);

        ArrayList<Integer> temp = new ArrayList<>(al1);

        al1.clear();
        al1.addAll(al2);
        al2.clear();
        al2.addAll(temp);

//        temp.stream().map(x->" "+x).forEachOrdered(System.out::print);
        System.out.println();
        al1.stream().map(x->" "+x).forEachOrdered(System.out::print);
        System.out.println();
        al2.stream().map(x->" "+x).forEachOrdered(System.out::print);

    }

}
