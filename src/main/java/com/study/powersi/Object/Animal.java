package com.study.powersi.Object;
//老鼠类
public class Animal  {

    private String name;
    private int id;

    //构造方法
    public Animal (String name, int id) {
        this.name = name;
        this.id = id;
    }

    private void eat(){
        System.out.println(name+"正在吃东西！");
    }

    private void sleep(){
        System.out.println(name+"正在睡觉");
    }

    private void introduction(){
        System.out.println("大家好！我是"+id+"号"+name);
    }
}
