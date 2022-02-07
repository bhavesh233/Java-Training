package com.execrises;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList <Integer>arrayList2 = new ArrayList<>();


        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);

        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        arrayList2.add(7);

        arrayList1.addAll(arrayList2);

        TreeSet<Integer> treeSet = new TreeSet<>();

        int count=0;
        for (Integer s:arrayList1){
            if(treeSet.add(s)==false){
                count++;
            }
        }

        System.out.println("distinc value "+treeSet.size());
        System.out.println("duplicate value "+count);
        System.out.println("removeall duplicate value "+treeSet);
    }

}
