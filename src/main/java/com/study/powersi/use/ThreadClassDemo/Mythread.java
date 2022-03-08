package com.study.powersi.use.ThreadClassDemo;

import com.sun.tools.sjavac.Main;

public class Mythread {
    public static void main(String[] args) {
        One one1 = new One("one1");
        One one2 = new One("one2");
        Thread thread1 = new Thread(one1);
        Thread thread2 = new Thread(one2);
        thread1.start();
        thread2.start();

        Two two1 = new Two("two1");
        Two two2 = new Two("two2");
        two1.start();
        two2.start();

    }
}

class One implements Runnable{
    private String name;

    public One(String name) {
        this.name = name;
    }

    public void run(){
        for(int x = 0; x < 3; x++) {
            System.out.println("线程："+name);
        }
    }
}

class Two extends Thread{

    public Two(String name) {
        super(name);
    }

    public void run(){
        for(int x = 0; x < 3; x++) {
            System.out.println("线程："+this.getName());
        }
    }
}

