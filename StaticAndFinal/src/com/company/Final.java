package com.company;


class FinalClass{

    final int MAX=10;
    final int MIN;
    final int MI;
    static final int SFI;

    static {
        SFI=4;
    }

    {
        MI=20;
    }

    public FinalClass(){
        MIN =1;
    }

    final public void print(){
        System.out.println("Final MEthod");
    }

}

class SecondFinal extends FinalClass{  //final class can not extends
    // public void print(){} can't overide bc of it is final method
    public void method(){
        System.out.println("Hello");
    }

}

public class Final {

    public static void main(String[] args) {

        FinalClass fc = new FinalClass();
        // fc.MIN = 12; can't change bc it is final varible
        fc.print();
    }

}
