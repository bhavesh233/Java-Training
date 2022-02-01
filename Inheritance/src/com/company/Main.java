package com.company;


class Member{

    public  String name,phone_number,address;
    public int age,salary;

    public void printSalary(){
        System.out.println( "name is "+this.name+" address is "+this.address+" phone_number is "+this.phone_number+" age is "+this.age  +" salary is "+this.salary);
    }

}


class Employee extends Member{

    public  String specialization;

}

class Manager extends Member{

    public  String department;

}


public class Main {

    public static void main(String[] args) {

        Employee employe = new Employee();
        employe.name = "Bhavesh";
        employe.address = "Rajkot";
        employe.age = 20;
        employe.phone_number= "1234567890";
        employe.specialization = "Java Programming";
        employe.salary = 20000;
        employe.printSalary();

        Manager manager = new Manager();
        manager.name = "Akshay";
        manager.salary = 50000;
        manager.age = 30;
        manager.address = "Rajkot";
        manager.department = "Computer";
        manager.phone_number="02345678";
        manager.printSalary();

    }
}
