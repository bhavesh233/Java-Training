package com.company;


interface CheckString{
    public boolean betterString(String str1,String str2);
}

public class LamdaClass {

    public static Boolean staticBetterString(String st1,String st2){
        return  st1.length() > st2.length()?true:false;
    }

    public static void main(String[] args) {

        CheckString ml = LamdaClass::staticBetterString;

        System.out.println(ml.betterString("hcccello","Bhssasaavesh"));

        CheckString cs = (st1,st2)->{
            return  st1.length() > st2.length()?true:false;
        };
        System.out.println(cs.betterString("hcccello","Bhavesh"));

//        CheckString cs = (st1,st2,st3)->{
//            return  st1.length() > st2.length()?st1.length()>st3.length()?st1:st3 :st2.length()>st3.length()?st2:st3;
//        };
//        System.out.println(cs.betterStringMethod("hcccello","Bhavesh","howareyou"));

    }
}
