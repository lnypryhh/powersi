package com.study.powersi.use.Serializable;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.address="1231841232@qq.com";
        employee.name="tome";
        employee.number=213;
        employee.SSN=31231;
        //序列化是写文件，所以是输出流
        try {
            FileOutputStream  stream = new FileOutputStream("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\Serializable\\employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            System.out.printf("Serialized data is saved in F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\Serializable\\employee.ser");
            stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
