package com.company;
import java.util.concurrent.*;


class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 1 is created ");
         for (int i=0;i<=40;i++){
            System.out.print(" ");
        }
        System.out.println("Task 1 done");

    }
}
class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 2 is created ");
        for (int i=0;i<=10;i++){
            System.out.print(" ");
        }
        System.out.println("Task 2 done");

    }
}

public class ExecutorServiceExample {


        public static void main(String[] args) {
            ExecutorService executorService = (ExecutorService) Executors.newFixedThreadPool(10);
            executorService.execute(new Thread(new Task1()));
            executorService.execute(new Thread(new Task2()));
            executorService.shutdown();
        }


}
