package com.study.powersi.major;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //增
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(110);
        arrayList.add(88);
        arrayList.add(564);
        Iterator<Integer> iterator = arrayList.iterator();
        ArrayList<Integer> clone = (ArrayList<Integer>)arrayList.clone();
        Iterator<Integer> iterator1 = clone.iterator();
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());
        }
    }
}
