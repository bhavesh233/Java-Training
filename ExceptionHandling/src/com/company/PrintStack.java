package com.company;

import java.util.Scanner;

class CustomExe extends Exception {

    public String toString() {
        return "Invalid Elasticsearch port configuration";
    }
}

public class PrintStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            if(sc.hasNextInt()) {
                int salary = sc.nextInt();
                if (salary > 65000) {
                    throw new CustomExe();
                }
            }else {
                throw new CustomExe();
            }
        }catch (CustomExe e){
            e.printStackTrace();
        }
    }
}
