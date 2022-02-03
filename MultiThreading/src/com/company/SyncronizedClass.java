package com.company;


class OddThread1 extends Thread{

   public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Odd Thread "+i);

        }
    }
}

class EvenThread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++){

            System.out.println("Even Thread "+i);
        }
    }
}

public class SyncronizedClass {

    public static void main(String[] args) {

            OddThread1 odt = new OddThread1();
            odt.start();

            EvenThread2 evt = new EvenThread2();
            Thread t1= new Thread(evt);
            t1.start();
    }
}
