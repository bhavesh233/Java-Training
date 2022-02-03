package com.company;


class DefineData{

    int arr[]= new int[10000];
    int number[]= new int[10000];

    int max = arr[0];
    int findNumber = number[0];

   synchronized public void calculateMethod(){
        for (int i=1;i<=10000;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            arr[i-1]= count;
            number[i-1]=i;

        }
    }

   synchronized public void findMaxMethod(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                findNumber = i;
            }
        }
        System.out.println(number[findNumber] +" number is divide by "+max+" time ");

     }


}


class MultiThreading implements Runnable{

    DefineData df;

    MultiThreading(DefineData df2){
        this.df = df2;

    }

    @Override
    public void run() {
       df.calculateMethod();

    }
}

class FindMaxNumber implements Runnable{

    DefineData df;

    FindMaxNumber(DefineData df2){
        this.df = df2;
    }

    @Override
    public void run() {
        df.findMaxMethod();

    }
}


public class Divisor {

    public static void main(String[] args) {

        DefineData df1= new DefineData();

        MultiThreading mt = new MultiThreading(df1);
        Thread t1 = new Thread(mt);
        t1.start();

        FindMaxNumber fmn= new FindMaxNumber(df1);
        Thread t2= new Thread(fmn);
        t2.start();


    }
}
