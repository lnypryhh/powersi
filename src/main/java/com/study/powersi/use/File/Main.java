package com.study.powersi.use.File;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        One one = new One();
        //one.NewFile();
        //one.ReadFile();
        //one.DelFile();
        //one.CopyFile();
        //one.NewTempFile();
        //one.TestFile();

        ListFile listFile = new ListFile();
        listFile.MkFile();
        listFile.DelDir();
    }
}
