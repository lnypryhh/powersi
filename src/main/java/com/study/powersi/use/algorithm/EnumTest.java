package com.study.powersi.use.algorithm;

enum Car{
    one(100),two(90),three(110),four(80);
    private int values;

    Car(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        for(Car c : Car.values()) {
            System.out.println(c + " 需要 " + c.getValues() + " 千美元。");
        }
    }

}
