package com.study.powersi.BaseDateType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {
        Boolean IsOrNo;
        Reg reg = new Reg();
        System.out.println(reg.regular("yanhaihong","hai"));

        reg.RegexMatches();

    }

    public Boolean regular(String str,String reg){

        boolean isMatch = Pattern.matches(reg, str);
        return true;
    }

    public void RegexMatches(){
        //已指定的正则表达式切割
        // 按指定模式在字符串查找
        String line = "This order w4as placed for QT3000! OK?";
        String pattern = "(\\D*)([3])(.*)";
        line.getClass().getName();
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }


}
