package com.study.powersi.BaseDateType;

public class one {
    static int a = 5;


    public static void main(String[] args) {

        System.out.println("Byte最小值："+ Byte.MIN_VALUE);
        System.out.println("Byte最大值："+ Byte.MAX_VALUE);

        System.out.println("Short最小值："+ Short.MIN_VALUE);
        System.out.println("Short最大值："+ Short.MAX_VALUE);

        System.out.println("Int最小值："+ Integer.MIN_VALUE);
        System.out.println("Int最大值："+ Integer.MAX_VALUE);

        System.out.println("Long最小值："+ Long.MIN_VALUE);
        System.out.println("Long最大值："+ Long.MAX_VALUE);

        System.out.println("Float最小值："+ Float.MIN_VALUE);
        System.out.println("Float最大值："+ Float.MAX_VALUE);

        System.out.println("Double最小值："+ Double.MAX_VALUE);
        System.out.println("Double最大值："+ Double.MAX_VALUE);

        System.out.println("Boolean True："+ Boolean.TRUE);
        System.out.println("Boolean False："+ Boolean.FALSE);

        System.out.println("Char最小值："+ Character.MAX_VALUE);
        System.out.println("Char最大值："+ Character.MIN_VALUE);


        one one = new one();

        one.value();
        int b=6;
        System.out.println("局部变量："+b);

    }

    public void value(){
        System.out.println("这是类变量："+one.a);

    }
}
