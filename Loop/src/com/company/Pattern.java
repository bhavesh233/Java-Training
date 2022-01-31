package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();

        if(inputString.matches("\\w*@gmail.com")){
            System.out.println("Correct");
        }else {
            System.out.println("InCorrect");
        }

    }
}
