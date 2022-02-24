package com.study.powersi.BaseDateType;

public class Str {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");
        stringBuilder.append("--qwertyui");

        System.out.println(stringBuilder.capacity());
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        String [] strs = {"a","b","c"};
        for(Object str: strs) {
            System.out.println(str);
        }

        new Str().format();
    }

    public void format(){
        Float floatVar = 1.354f;
        Integer intVar = 100;
        String stringVar = "String";
        System.out.printf("浮点型变量的值为%.2f, 整型变量的值为%d, 字符串变量的值为is %s \n", floatVar, intVar, stringVar);

        String fs;
        fs = String.format("浮点型变量的值为%f, 整型变量的值为%d, 字符串变量的值为%s", floatVar, intVar, stringVar);
        System.out.println(fs);

        System.out.println("返回字符串指定位置字符："+fs.charAt(16));
        System.out.println("连接字符串到尾部："+fs.concat("----尾部"));


    }
}
