package com.study.powersi.use.ThreadClassDemo;

public class TwoThreadAlive extends Thread{
    public void run(){
        for(int x = 0; x <10 ; x++) {
            printMag();
        }
    }

    public void printMag(){
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("当前线程名称："+name);
    }

    public static void main(String[] args) {

        TwoThreadAlive twoThreadAlive = new TwoThreadAlive();
        twoThreadAlive.setName("yhh");
        System.out.println("在这个线程还没有start之前，还是active="+twoThreadAlive.isAlive());
        twoThreadAlive.start();
        System.out.println("在这个线程start之后="+twoThreadAlive.isAlive());
        for(int x = 0; x <10 ; x++) {
            twoThreadAlive.printMag();
        }

        System.out.println("The end of main(), tt.isAlive()=" + twoThreadAlive.isAlive());
    }
}
