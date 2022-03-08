package com.study.powersi.use.algorithm;

public class two {
    //打印菱形
    public void printLx(int size){
        if(size%2==0){
            System.out.println("菱形行数为双数，默认加一");
            size++;
        }
        for(int x = 1; x <size+1 ; x++) {
            for(int i = 0; i <Math.abs((size+1)/2-x) ; i++) {
                System.out.print(" ");
            }

            for(int i =0 ; i <size-2*Math.abs((size+1)/2-x) ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //打印乘法表
    public void print99(){
        for(int x =1 ; x<=9 ; x++) {
            for(int i =1 ; i <=x ; i++) {
                System.out.print(x+"x"+ i+"="+x*i);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    //打印三角形
    public  void three(int m){
        for(int x = m; x >0; x--) {
            for(int t = 0; t < m-x; t++) {
                System.out.print(" ");
            }
            for(int t =0 ; t < 2*x-1; t++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
