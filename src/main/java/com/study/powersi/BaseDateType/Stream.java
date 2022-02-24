package com.study.powersi.BaseDateType;

import java.io.*;

public class Stream {
    public static void main(String[] args) throws FileNotFoundException {
        Stream stream = new Stream();
        /*try {
            System.out.println(stream.Str1());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int file = stream.File();
        System.out.println(file);*/

        stream.ReadAndWrite();


    }

    public StringBuilder Str1() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder read ;
        boolean quit=true;
        do {
            read = new StringBuilder(bufferedReader.readLine());
            quit = read.toString().equals("quit");
            System.out.println(quit);
        }while(!quit);
        return read;
    }

    public int File() throws FileNotFoundException {
        //输入流
        InputStream f = new FileInputStream("F:/Java/Project/src/main/resources/input.txt");
        byte[] b = new byte[1024];
        int s = 0;
        try {
            s = f.read(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public String Io(){
        return null;
    }

    
    public void ReadAndWrite(){
        //输出流，向文件写内容
        FileOutputStream output = null;
        //输入流，读取文件内容
        FileInputStream input = null;

        File file = new File("F:/Java/Project/src/main/resources/input.txt");
        try {
            //写入内容,覆盖
            output = new FileOutputStream(file);
            String t = "颜海红1231231";
            byte[] tbytes = t.getBytes();
            output.write(tbytes);
            output.close();
            //追加
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write("\nyhhh");
            fileWriter.close();

            //读取文件字节数
            input = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            int read = input.read(bytes);
            System.out.println(read);


            //读取txt文件内容
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            String result = "";
            while((s=bufferedReader.readLine())!=null){
                result = result+s;
                System.out.println("s:"+s);
            }
            System.out.println(result);
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
