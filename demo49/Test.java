package cn.itcast.demo49;

import java.io.File;

/*
    File类的获取功能：
        getAbsolutePath();  获取绝对路径
        getPath();          获取相对路径
        getName();          获取文件名
        list();             获取指定目录下所有文件（夹）名称数组
        listFile();         获取指定目录下所有文件（夹）File数组

    JAVA中路径的划分：
        绝对路径：
            以盘符开头的路径，固定的，写"死"的路径
        相对路径：
            意思是相对于某个路径而言，Java中的相对路径指：相对于当前项目的路径来讲的
 */
public class Test {
    public static void main(String[] args) {
        File file1 = new File("lib/1.txt");
        //获取file1的绝对路径
        String path1 = file1.getAbsolutePath();
        System.out.println("绝对路径:" + path1);
        //获取file1的相对路径
        String path2 = file1.getPath();
        System.out.println("相对路径:" + path2);

        //获取文件名
        String fileName = file1.getName();
        System.out.println("文件名：" + fileName);
        System.out.println("======================");
        //获取lib文件夹下所有的文件（夹）的：名称数组
        File file2 = new File("lib");
        String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---------------");
        //获取lib文件夹下所有的文件（夹）的：File对象数组File[]
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
