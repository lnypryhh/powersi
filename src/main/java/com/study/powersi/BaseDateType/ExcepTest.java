package com.study.powersi.BaseDateType;

public class ExcepTest {
    public static void main(String[] args) throws ArithmeticException {


        try {
            int a=5/0;
            int [] b =new  int[2];
            b[3]=11;
        }catch (ArithmeticException e){
            System.out.println("异常，，不能被零除"+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("非法索引"+e);
        }catch (Exception e){
            System.out.println("都不对");
        }finally {
            System.out.println("最后无论如何都要执行");
        }
        //抛出异常
        throw new ArithmeticException("除数不能为0");
    }
}

class myself extends Exception{
    private double amount;

    public myself(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
