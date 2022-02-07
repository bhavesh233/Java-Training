package com.company;

import java.util.ArrayDeque;

public class ArrayDeques {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();


        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerFirst(40);

//        dq.forEach(x-> System.out.println(x));

        System.out.println();
        dq.offerLast(100);
        dq.add(200);
        dq.offerLast(300);
        dq.forEach(x-> System.out.print(" "+x));

        System.out.println();

        dq.poll(); //first elment delete
        dq.pollFirst();
        dq.pollLast();
        dq.forEach(x-> System.out.print(" "+x));



    }

}
