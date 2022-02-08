package com.execrise;

import java.util.Scanner;

public class Example4 {
    public static void main(String args[]) {
        int array[] = {10, 20, 25, 63, 96, 57};
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();

        boolean flage= false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputValue) {
                System.out.println("Element found index is :" + i);
                flage=true;
            }
        }

        if(!flage){
            System.out.println("Value not found");
        }
    }
}
