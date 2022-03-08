package com.study.powersi.use.algorithm;

public class cover {
    public static void main(String[] args) {
        OneTest oneTest = new OneTest(10.0,10.0);
        System.out.println(oneTest.area());

        TwoTest twoTest = new TwoTest(10.0,10.0);
        System.out.println(twoTest.area());

    }
}

//方法覆盖
//
class OneTest{
    Double dim1;
    Double dim2;
    OneTest(Double dim1, Double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    Double area(){
        System.out.println("OneTest");
        return dim1*dim2;
    }

}

class TwoTest extends OneTest{
    TwoTest(Double dim1, Double dim2) {
        super(dim1, dim2);
    }

    Double area(){
        System.out.println("TwoTest");
        return dim1*dim2;
    }

}
