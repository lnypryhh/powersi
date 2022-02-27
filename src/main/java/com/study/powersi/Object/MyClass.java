package com.study.powersi.Object;

enum Yhh {
    yellow, red, green;

    public String All(){
        String a = "";
        for(Yhh element: Yhh.values()) {
            a+= element;
        }
        return a;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Yhh yhh_red = Yhh.red;
        System.out.println(Yhh.green.ordinal());

        String all = yhh_red.All();
        System.out.println(all);

    }
}