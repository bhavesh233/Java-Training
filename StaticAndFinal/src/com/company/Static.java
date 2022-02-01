package com.company;


class StaticClass{

    static int val1=12;
    String val2="HELLO";

    static void print(){
           System.out.println(val1);
        // System.out.println(val2); error because val2 isn't static varible;
    }
}
public class Static {

    public static void main(String[] args) {

        StaticClass st =new StaticClass();
        st.val2 = "HELL";   //here I change non static varible it changed for only st refrence of StaticClass
        st.val1=15;         //it change all refrence of StaticClass bc it is static varible
        st.print();

        StaticClass st1 =new StaticClass();
        st1.val1= 500;
        System.out.println(st1.val2);
        st1.print();

        StaticClass st2 =new StaticClass();
        st2.print();


    }
}
