package com.company;

import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[j][i] = count;
                count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < a.length; j++) {
            System.out.print("  " + a[0][j]);
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            System.out.print("  " + a[j][a.length - 1]);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.print("  " + a[i][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            int j = a.length - 1 - i;
            System.out.print("  " + a[i][j]);
        }

    }
}
