package com.company;

public class SubArray {
    public static void main(String[] args) {

        int a[] = {0,1,2,3,4,5,6,7,8,9,10,11};
        int b[] =  new int[6];
        int count=0;

        for (int i=0;i<a.length;i++){
            if(i>=4 && i<=9){
                b[count] = a[i];
                count++;
            }
        }

        for (int i=0;i<b.length;i++){
            System.out.print(" "+b[i]);
        }

    }
}
