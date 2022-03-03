package com.study.powersi.major;

import java.util.HashMap;

public class HashMap_test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.put(4,"four");
        System.out.println(hashMap);
        hashMap.remove(3);
        for(Integer e: hashMap.keySet()) {
            System.out.println("key:"+e+",value="+hashMap.get(e));
        }
    }
}
