package com.study.powersi.use.algorithm;

//汉诺塔算法
public class One {
    public void doTowers(int nDisks,String A,String B,String C){
        //第一个数字表示A中盘子数，A,B,C盘子。A从小到大，最后放到C
        if(nDisks==1){
            System.out.println("从"+A+"移动到"+C);
        }else {

            doTowers(nDisks-1,A,C,B);
            System.out.println("从"+A+"移动到"+C);;
            doTowers(nDisks-1,B,A,C);

        }
    }

    public int fibonacci(int t){
        //斐波拉契
        if(t==0||t==1){
            return 0;
        }else {
            return fibonacci(t-1)+fibonacci(t-2);
        }
    }

    public int factorial(int t){
        if(t==0||t==1){
            return 1;
        }else{
            return t*factorial(t-1);
        }
    }
}
