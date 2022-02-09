package com.company;

import java.lang.reflect.Array;

public class Generic1 {

//    static <E> void show(E[] list){
//        for(E x:list){
//            System.out.println(x);
//        }
//    }


    static <E extends Number> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
//      show(new String[]{"HI","Hello"}); // it gives a error
        show(new Integer[]{10,20});
        show(new Float[]{12.2f,33.43f});
    }

}
