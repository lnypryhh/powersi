package com.study.powersi.use.algorithm;

import com.study.powersi.Object.TestSuperSub;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        //one.doTowers(3,"第一个盘子A","第二个盘子B","第三个盘子C");
//        for(int x = 0; x < 10; x++) {
//            System.out.println("第"+x+"个数："+one.fibonacci(x));
//        }
        //System.out.println(one.factorial(10));


        two two = new two();
        //打印菱形
        //two.printLx(7);
        //打印乘法表
        //two.print99();
        //三角形
        //two.three(5);
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.runoob.");
        }
        catch (UnknownHostException e) {
            System.out.println("对应域名主机不存在"+e.getStackTrace());
            System.exit(2);
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.exit(0);
    }
}
