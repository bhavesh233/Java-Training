package com.company;

interface A{}
class B implements A{};
class C implements A{};


class Test3<T>{
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

public class Generic4 {


    static  void fun(Test2<? super A> obj){
        obj.display();
    }

    public static void main(String[] args) {

        Test2 t2  = new Test2();
        Test2 <A>t3  = new Test2();
        Test2 <B>t4  = new Test2();

        fun(t3);
    }

}
