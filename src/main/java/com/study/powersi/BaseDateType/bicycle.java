package com.study.powersi.BaseDateType;


public class bicycle {
    public  void While(int a){
        int b=0;
        while(b!=5){
            System.out.println("int值："+ a);
            b++;
        }

    }

    public  void DoWhile(int a){
        int b=0;
        do {
            System.out.println("int值："+ a);
            b++;
        }while(b==5);
    }

    public  void For(int a){
        for(int x = 1; x < a; x++) {
            System.out.println("x值："+a);
        }

        int []b= {1,2,3};

        for(int t:b){
            System.out.println("for增强语句："+t);
        }
    }

    public static void main(String[] args) {
        bicycle bicycle = new bicycle();
        bicycle.While(5);
        System.out.println("-----------");
        bicycle.DoWhile(5);
        System.out.println("-----------");
        bicycle.For(5);


    }

}
