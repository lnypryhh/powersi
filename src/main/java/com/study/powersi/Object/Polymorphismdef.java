package com.study.powersi.Object;

public class Polymorphismdef {
    public static void main(String[] args) {
        show(new Dog());//吃骨头,看家
        show(new Cat());//吃鱼,抓老鼠
        Animals cat = new Cat();
        cat.eat();//吃鱼
        Cat c = (Cat)cat;
        c.work();//抓老鼠
    }

    public static void show(Animals animals) {
        animals.eat();
        if (animals instanceof Cat) {
            Cat c = (Cat) animals;
            c.work();
        } else if (animals instanceof Dog) {
            Dog d = (Dog) animals;
            d.work();
        }
    }
}

abstract class Animals {
    abstract void eat();
}

class Cat extends Animals {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animals {

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}