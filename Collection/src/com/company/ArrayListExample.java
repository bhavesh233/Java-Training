package com.company;

import java.util.*;

public class ArrayListExample extends ArrayList<Integer> {

    public static void main(String[] args) {

        ArrayList<Integer> al1 =new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<Integer>(List.of(50,60,60,70,80));

        al1.add(10);
        al1.add(1,20);
        al1.addAll(1,al2);
        al1.set(1,100);
        al1.remove("100");

/*

        ArrayListExample arr = new ArrayListExample();

        // use add() method to add values in the list
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(12);
        arr.add(9);
        arr.add(13);

        // prints the list before removing
        System.out.println("The list before using removeRange:" + arr);

        // removing range of 1st 2 elements
        arr.removeRange(0, 2);
        System.out.println("The list after using removeRange:" + arr);
*/



//        Collections.sort(al1);
//        al1.removeAll(al2);
//        al1.remove(1);
//        al1.ensureCapacity(1020);
//        al1.clear();
//        System.out.println(al1.isEmpty());
//        System.out.println(al1.lastIndexOf(60));
//        System.out.println(al1.indexOf(60));
//        System.out.println(al1.get(2));
//        System.out.println(al1.contains(100));
//        System.out.println(al1.size());
//        System.out.println(al1);
//        System.out.println(al2);

        al1.stream().map(x -> " " +x).forEachOrdered(System.out::print);



//        System.out.println();
//        al1.forEach((x)->{
//            System.out.print(" "+ x);
//        });
//        System.out.println();
//
//        Iterator<Integer> it = al1.iterator();
//        while (it.hasNext()){
//            System.out.print(" "+it.next());
//        }
//        System.out.println();

//        ListIterator<Integer> it1 = al1.listIterator();
//        while (it1.hasNext()){
//            System.out.print(" "+it1.previous());
//        }



    }
}
