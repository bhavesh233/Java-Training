package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        if(n%2!=0){

            for(int i=n/2;i>0;i--){
                System.out.print("*");
                for (int j=i;j>=1;j--){
                    System.out.print(" ");
                }
                for (int k=i;k>=0;k--){
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.print("**");
            System.out.println();

            for(int i=n/2;i>=1;i--){
                System.out.print("*");
                for (int j=i;j<=n/2;j++){
                    System.out.print(" ");
                }
                for (int k=i;k<=(n/2)+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            System.out.println("Please valid input");
        }
    }
}
