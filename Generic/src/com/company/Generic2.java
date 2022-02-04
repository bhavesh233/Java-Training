package com.company;


class Test2<T>{
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

public class Generic2 {


    static  void fun(Test2<? extends Number> obj){
        obj.display();
    }

    public static void main(String[] args) {

        Test2 t2  = new Test2();
        Test2 <String>t3  = new Test2();
        Test2 <Integer>t4  = new Test2();


        t3.appned("Bhavesh");
        t3.appned("HI");
//         fun(t3);

        t2.appned(123);
        t2.appned("Hello");
        fun(t2);

        t4.appned(123);
        t4.appned(13333);
        fun(t4);


    }

}
