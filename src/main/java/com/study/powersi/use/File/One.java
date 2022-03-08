package com.study.powersi.use.File;


import java.io.*;

public class One {

    //创建文件并写入内容
    public void NewFile(){
        try {
            FileWriter writer = new FileWriter("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\NewFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("create file\n");
            //向文件中追加文件
            bufferedWriter.write("hello world");
            bufferedWriter.close();
            System.out.println("创建文件成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //读取文件内容
    public void ReadFile(){
        try {
            FileReader reader = new FileReader("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\NewFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String str;
            while((str = bufferedReader.readLine()) !=null){
                System.out.println(str);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //删除文件,删除文件之前，需要确认没有对象还在使用该文件
    public void DelFile(){
        File file = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\NewFile.txt");

        if(file.delete()){
            System.out.println("文件"+file.getPath()+"删除成功");
        }else{
            System.out.println("文件 "+file.getPath()+" 删除失败");
        }
    }

    //将NewFile.txt内容复制到NewFile2.txt
    public void CopyFile(){
        File file = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\NewFile.txt");
        File file1 = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\NewFile1.txt");
        //输入流拿到内容，输出流出写入文件
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(file1);
            byte[] by = new byte[1024];
            int len;
            while ((len = inputStream.read(by)) > 0){
                outputStream.write(by,0,len);
            }
            outputStream.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //创建临时文件
    public void NewTempFile(){
        try {
            File tempFile = File.createTempFile("test_temp", "txt", new File("F:\\\\Java\\\\Project\\\\src\\\\main\\\\java\\\\com\\\\study\\\\powersi\\\\use\\\\File\\\\Test"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            writer.write("haitao.zhang");
            writer.close();
            System.out.println("输出绝对路径"+tempFile.getAbsolutePath());
            System.out.println("终止后删除临时文件");
            Thread.sleep(5000);
            tempFile.deleteOnExit();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    //文件基本操作（创建文件，重命名，写入内容，获取文件大小等）
    public void TestFile() throws IOException{
        //创建文件
        File file = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\TestFile.txt");
        try {
            boolean newFile = file.createNewFile();
            if(newFile){
                System.out.println("文件创建成功");
            }else{
                System.out.println("文件已经存在");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //重命名
        File newfile = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\TestFile-new.txt");
        if(newfile.exists()){
            System.out.println("新文件已经存在");
            throw new java.io.IOException("file exists");
        }else if (file.renameTo(newfile)){
            System.out.println("从命名成功");
        }else {
            System.out.println("error");
        }

        //文件路径比较(包括文件名)
        File file1 = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\one.txt");
        File file2 = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\two.txt");
        if(file1.compareTo(file2)==0){
            System.out.println("文件路径相同");
        }else{
            System.out.println("文件路径不相同");
        }

    }
}
