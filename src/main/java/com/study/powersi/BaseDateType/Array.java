package com.study.powersi.BaseDateType;

import java.util.HashMap;
import java.util.Map;

public class Array {
    public Map<String, Object[]> one(){

        Map<String, Object[]> map = new HashMap<>();

        Integer [] in = new Integer[3];
        map.put("int[]",in);

        Character [] chList = new Character[3];
        chList[0] = '0';
        chList[1] = '1';
        chList[2] = '2';
        map.put("char[]",chList);

        Double [] dou = new  Double[3];
        map.put("double[]",dou);

        String [] str = new String[3];
        map.put("String[]",str);
        return map;

    }

    public static void main(String[] args) {
        Array array = new Array();
        Map<String, Object[]> one = array.one();
        Character[] chList = (Character[]) one.get("char[]");
        for(Character e: chList) {
            System.out.println(e);
        }

    }
}
