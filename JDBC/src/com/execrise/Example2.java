package com.execrise;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int arr[]={10};
        Arrays.stream(arr).map(s->s*3).forEach(System.out::println);
    }

}
