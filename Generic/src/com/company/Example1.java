package com.company;


class Car {
    int price;

    public Car(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Employee {
    int eSalary;
    String eName;

    public Employee(int eSalary, String eName) {
        this.eSalary = eSalary;
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}

interface interface1<T> {
    boolean betterElement(T A, T B);
}

public class Example1 {

    public static void main(String[] args) {

        Car car1 = new Car(10);
        Car car2 = new Car(20);

        Employee employee1 = new Employee(5000, "Bhavesh");
        Employee employee2 = new Employee(1000, "Akshay");

        String str1 = "Welcom";
        String str2 = "Hi";


        interface1<String> stringInterface = (String s1, String s2) ->
        {
            if (s1.length() < s2.length()) {
                System.out.println("String 2 is larger than s1");
                return true;
            } else if (s1.length() > s2.length()) {
                System.out.println("String 1 is larger than string 2");
                return false;
            } else {
                System.out.println("same");
                return false;
            }

        };

        stringInterface.betterElement(str1, str2);

        interface1<Employee> eInterface = (Employee w1, Employee w2) -> w1.geteSalary() > w2.geteSalary();

        if (eInterface.betterElement(employee1, employee2)) {
            System.out.println(employee1.eName + " salary is more than worker 2");
        } else {
            System.out.println(employee2.eName + "Worker2 salary is more than worker 1");
        }

        interface1<Car> cInterface = (Car c1, Car c2) -> c1.getPrice() > c2.getPrice();

        if (cInterface.betterElement(car1, car2)) {
            System.out.println("car1's price bigger  than car2");
        } else {
            System.out.println("car2's price bigger than car1");
        }


    }

}


