package com.study.powersi.use.File;

import java.io.File;

public class ListFile {
    //递归创建目录。删除
    public void MkFile(){
        File file = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\abc\\def\\etd");
        boolean mkdirs = file.mkdirs();
        if(mkdirs){
            System.out.println("递归创建目录成功");
        }else {
            System.out.println("目录已经存在");
        }
        File file1 = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\abc\\def\\etd");
        boolean delete = file1.delete();
        if(delete){
            System.out.println("删除成功");
        }
    }

    public void DelDir(){
        File file = new File("F:\\Java\\Project\\src\\main\\java\\com\\study\\powersi\\use\\File\\Test\\abc");
        for(String e: file.list()) {
            System.out.println(e);
        }
    }
}
