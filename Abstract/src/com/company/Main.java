package com.company;


import java.util.Scanner;

abstract class ArithmeticOperation{

    abstract public double operation(double arg1,double arg2);
}


class Addition extends ArithmeticOperation{
    @Override
    public double operation(double arg1, double arg2) {
     return  arg1+arg2;
    }
}


class Subtraction extends ArithmeticOperation{
    @Override
    public double operation(double arg1, double arg2) {
        return  arg1-arg2;
    }
}


class Multiplication extends ArithmeticOperation{
    @Override
    public double operation(double arg1, double arg2) {
        return  arg1*arg2;
    }
}


class Divsion extends ArithmeticOperation{
    @Override
    public double operation(double arg1, double arg2) {
        return  arg1/arg2;
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Choose any Operation ");
        System.out.println("1. Operation Addition");
        System.out.println("2. Operation Subtraction");
        System.out.println("3. Operation Multiplication");
        System.out.println("4. Operation Division");


        String choose = sc.nextLine();

        ArithmeticOperation ao;

        switch (choose){
            case "1":{
                System.out.println("Please enter value 1");
                int a=  sc.nextInt();
                System.out.println("Please enter value 2");
                int b=  sc.nextInt();
                ao = new Addition();
                System.out.println(ao.operation(a,b));
            }
            case "2":{
                System.out.println("Please enter value 1");
                int a=  sc.nextInt();
                System.out.println("Please enter value 2");
                int b=  sc.nextInt();
                ao = new Subtraction();
                System.out.println(ao.operation(a,b));
            }
            case "3":{
                System.out.println("Please enter value 1");
                int a=  sc.nextInt();
                System.out.println("Please enter value 2");
                int b=  sc.nextInt();
                ao = new Multiplication();
                System.out.println(ao.operation(a,b));
            }
            case "4":{
                System.out.println("Please enter value 1");
                int a=  sc.nextInt();
                System.out.println("Please enter value 2");
                int b=  sc.nextInt();
                ao = new Divsion();
                System.out.println(ao.operation(a,b));
            }
        }


    }
}
