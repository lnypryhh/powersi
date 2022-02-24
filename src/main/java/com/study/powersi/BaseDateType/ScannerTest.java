package com.study.powersi.BaseDateType;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        ScannerTest scannerTest = new ScannerTest();
        scannerTest.inputnext();
        scannerTest.inputnextLine();

    }

    public void inputnext() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------next----------");
        while (scanner.hasNext()) {
            String next = scanner.next();
            boolean b = next.equalsIgnoreCase("quit");
            if (b){
                break;
            }
            System.out.println(next);
        }
    }

    public void inputnextLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------nextLine----------");
        while (scanner.hasNext()) {
            String c = scanner.nextLine();
            if (c.equalsIgnoreCase("quit")){
                System.out.println("nextLine结束");
                break;
            }
            System.out.println(c);
        }
    }
}
