package com.execrises;

import java.util.HashMap;
import java.util.Map;

class Book{
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

}


public class Example3 {

    public static void main(String[] args) {

        HashMap<Integer,Book> map = new HashMap<>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for (Map.Entry m:map.entrySet()){
            int key = (int) m.getKey();
            Book b = (Book) m.getValue();

            System.out.println("key "+key+" "+b.id+" "+b.name+" "+b.publisher+" "+b.quantity);

        }
    }

}
