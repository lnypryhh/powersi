package com.study.powersi.major;

import java.util.LinkedList;

public class LinkedList_test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("qwer");
        linkedList.add("asdf");
        linkedList.add("123");

        String s = linkedList.removeFirst();
        linkedList.addFirst("first");
        linkedList.addLast("last");
        for(int x = 0; x <linkedList.size() ; x++) {
            System.out.println(linkedList.get(x));
        }



    }
}
