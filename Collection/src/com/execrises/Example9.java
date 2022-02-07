package com.execrises;

import java.util.ArrayList;
import java.util.Scanner;

class PhoneBook{
    String name,phone_number;

    public PhoneBook(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }
}

public class Example9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PhoneBook pb1 = new PhoneBook("bhavesh","123456789");
        PhoneBook pb2 = new PhoneBook("tulesh","987654321");
        PhoneBook pb3 = new PhoneBook("rahul","111111111");

        String listName = sc.nextLine();

        boolean flag=false;
        ArrayList<PhoneBook> arrayList = new ArrayList<>();
        arrayList.add(pb1);
        arrayList.add(pb2);
        arrayList.add(pb3);

        for (PhoneBook b:arrayList){
            if(b.name.equals(listName)){
                System.out.println(b.name+" == "+b.phone_number);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("name not found");
        }




    }



}
