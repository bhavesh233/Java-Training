package com.company;

import java.util.Scanner;

class CustomEx extends Exception{

    public String toString(){
        return "Salary is more than 87000";
    }

}

public class CustomException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int salary= sc.nextInt();
        try {
            if(salary>87000) {
                throw new CustomEx();
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
