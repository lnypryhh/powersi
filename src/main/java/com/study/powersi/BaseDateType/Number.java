package com.study.powersi.BaseDateType;

import static java.lang.Math.toDegrees;

public class Number {
    public static void main(String[] args) {
        System.out.println("平方："+Math.pow(3,2));
        System.out.println("将参数转化为角度："+toDegrees(Math.PI));

        //Character类
        char ch = 'a';
        //Unicode 字符表示形式
        char uniChar = '\u039A';
        System.out.println("Unicode 字符表示形式:"+uniChar);
        // 字符数组
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        String[] str_test = {"fghjk","sa"};

    }
}
