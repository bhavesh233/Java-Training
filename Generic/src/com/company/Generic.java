package com.company;


class Test<T>{
    T A[] =(T[]) new Object[10];
    int length=0;

    public void appned(T v){
        A[length++]= v;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}


public class Generic {

    public static void main(String[] args) {

        Test <Integer>t1= new Test();
        t1.appned(123);
//        t1.appned("hell"); error
        t1.appned(1233333);
        t1.display();

        Test <String>t2= new Test();
        t2.appned("Bhavesh");
        t2.appned("HI");
        t2.display();
    }
}
