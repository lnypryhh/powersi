package com.study.powersi.use.String;

import com.study.powersi.BaseDateType.Str;

import java.util.StringTokenizer;

public class One {
    public void StringCompareEmp() {
        String str1 = "Hello word";
        String str2 = "hello word";
        Object str3 = str1;
        //比较ascll码值，从第一个字母比较，H比h小32，所以返回32
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareToIgnoreCase(str1));
        System.out.println(str1.compareTo(str1.toString()));
    }

    public void SearchlastString() {
        String str = "Hello world ,Hello Runoob";
        int runoob = str.lastIndexOf("Runoob");
        if(runoob==-1){
            System.out.println("没有该字符串Runoob");
        }

        System.out.println("Runoob 字符串最后出现的位置:"+runoob);
    }

    public void Delchar(){
        int i =3;
        String str = "i am yan haihong";
        String t = str.substring(0,3)+str.substring(i+1);
        System.out.println(t);
    }

    public void StringReplaceEmp(){
        String str = "yan hai hong";
        //String replace = str.replace("a", "Yn");
        String replace = str.replaceFirst("a", "Yn");
        System.out.println(replace);
    }

    public void StringReverseExample(){
        String str = "qwer asdf zxcv";
        String stringBuilder = new StringBuilder(str).reverse().toString();
        System.out.println("反转前："+str);
        System.out.println("反转后："+stringBuilder);
    }

    public void SearchStringEmp(){
        String str = "hello word";
        int o = str.indexOf("o");
        if(o==-1){
            System.out.println("没有找到o字符串");
        }else {
            System.out.println("o字符串的位置："+o);
        }
        System.out.println(o);
    }

    public void JavaStringSplitEmp(){
        String str = "yan hai hong asdh";
        String t = " ";
        String[] split = str.split(t);
        for(String e: split) {
            System.out.println(e);
        }

    }

    public void StringTokenizer(){
        //StringTokenizer默认分隔符：空格、制表符（\t）、换行符(\n）、回车符（\r）
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }

    public void StringToUpperCaseEmp(){
        String str = "SHfjaShIJisfdaj";
        String s = str.toUpperCase();
        System.out.println("大写："+s);
        String s1 = str.toLowerCase();
        System.out.println("小写："+s1);

    }

    public void StringRegionMatch(){
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";

        boolean b = first_str.regionMatches(11, second_str, 12, 3);
        System.out.println("不忽略大小写："+b);

        boolean c = first_str.regionMatches(true,11, second_str, 12, 3);
        System.out.println("不忽略大小写："+c);
    }

    public void StringComparePerformance(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串"
                + " : "+ (endTime - startTime)
                + " 毫秒" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串"
                + " : " + (endTime1 - startTime1)
                + " 毫秒");
    }

    public void StringOptimization(){
        String variables[] = new String[50000];
        for( int i=0;i <50000;i++){
            variables[i] = "s"+i;
        }
        long startTime0 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串： "+ (endTime0 - startTime0)  + " ms" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用 new 关键字：" + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象的 intern() 方法: "
                + (endTime2 - startTime2)
                + " ms");
    }

    public void StringFormat(){
        double pi = Math.PI;
        System.out.format("%.2f%n",pi);
    }

    public void StringConcatenate(){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 + 操作符 : "
                + (endTime - startTime)+ " ms");
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 StringBuffer : "
                + (endTime1 - startTime1)+ " ms");
    }
}
