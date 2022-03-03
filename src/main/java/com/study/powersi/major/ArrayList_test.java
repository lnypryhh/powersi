package com.study.powersi.major;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //增
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(110);
        arrayList.add(88);
        arrayList.add(564);
        //删
        arrayList.remove(1);
        //改
        arrayList.set(1,78);
        //查
        Integer s = arrayList.get(1);
        System.out.println(s);

        System.out.println("arraylist长度："+arrayList.size());

        Collections.sort(arrayList);

        for(Integer e: arrayList) {
            System.out.println(arrayList.indexOf(e)+"="+e);
        }

        arrayList.removeIf(e->e%2==0);

        System.out.println(arrayList);

    }
}
