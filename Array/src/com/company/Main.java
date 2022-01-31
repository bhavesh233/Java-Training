package com.company;

public class Main {

    public static void main(String[] args) {

        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int B[][] = {{3,2,1},{1,3,2},{1,2,2}};

        int C[][]=new int[3][3];

        for (int i=0;i<A.length;i++){
            for (int j=0;j<B[i].length;j++){
                int temp =0;
                for (int k=0;k<B[i].length;k++){
                    temp = temp+A[i][j]*B[k][j];
                }
                C[i][j] = temp;
            }        }

        for (int i=0;i<A.length;i++){
            for (int j=0;j<B[i].length;j++){
                System.out.print(" "+C[i][j]);
            }
            System.out.println();
        }

    }
}
