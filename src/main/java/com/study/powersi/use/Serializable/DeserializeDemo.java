package com.study.powersi.use.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        //反序列化是读文件,输入到内存
        try {
            FileInputStream fileInputStream = new FileInputStream("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\Serializable\\employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            e = (Employee)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(e.address);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
