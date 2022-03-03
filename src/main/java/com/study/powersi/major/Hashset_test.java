package com.study.powersi.major;

import java.util.HashMap;
import java.util.HashSet;

public class Hashset_test {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("3231");
        str.add("qwe");
        str.add("weqw");
        str.add("errd");
        str.add(null);
        str.remove("qwe");
        //判断元素是否在集合中
        System.out.println(str.contains("3231"));
        for(String e: str) {
        System.out.println(e);
        }
        //清空集合
        str.clear();
    }
}
