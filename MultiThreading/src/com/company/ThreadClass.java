package com.company;


class MyData{
    synchronized public void Odd(){
        for(int i=1;i<1000;i++){
            if(i%2!=0){
                System.out.println("Odd Number "+i);
                try {
                    Thread.sleep(10);
                }catch (Exception e){

                }
            }
        }
    }
    synchronized public void even(){
        for(int i=1;i<1000;i++){
            if(i%2==0){
                System.out.println("even Number "+i);
            }
        }
    }
}


class OddThread extends Thread{

    MyData d;
    OddThread(MyData dat){
        this.d= dat;
    }

    public void run(){
        d.Odd();
    }
}


class EvenThread implements Runnable{

    MyData d;
    EvenThread(MyData dat){
        this.d= dat;

    }

    @Override
   public void run() {
        d.even();
    }
}



public class ThreadClass {
    public static void main(String[] args) {

        MyData data = new MyData();
        OddThread odt = new OddThread(data);

        EvenThread evt = new EvenThread(data);
        Thread t1= new Thread(evt);

        odt.start();
        t1.start();

    }
}
