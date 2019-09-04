package cn.itcast.demo48;

import java.io.File;
import java.io.IOException;

/*
    File类：
        概述：
            文件，文件夹，一个File对象代表磁盘上的某个文件或文件夹
            解释：就使用来操作文件（夹）路径的。

        构造方法：
            File（String pathname）   根据给定的字符串路径创建其对应File对象
            File（String parent, String child）  根据给定的字符串形式的父目录和子文件（夹）名创建File对象
            File（File parent,String child)      根据给定父目录对象和子文件（夹）名创建File对象

        成员方法：
            创建功能：   如果不存在就创建，返回true，否则就不创建，返回false
                creatNewFile(): 创建文件
                mkdir():        创建单级目录
                mkdirs():       创建目录

            判断功能：
                isDirectory():  判断File对象是否为目录
                isFile():       判断File对象是否为文件
                exists():       判断File文件是否存在
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：将D:\abc\1.txt 封装成File对象
        //方式一：  根据字符串形式的路径获取File对象
        File file1 = new File("D:\\abc\\1.txt");
        System.out.println("file1:"+file1);

        //方式二：  根据字符串形式的父目录以及子目录创建File对象
        File file2 = new File("D:/abc/","1.txt");
        System.out.println(file2);

        //方式三：  根据父目录对象以及字符串形式的子目录来获取File对象
        File file3 = new File("D:/abc/");
        File file4 = new File(file3+"1.txt");
        System.out.println("4:"+file4);
        System.out.println("================");
        System.out.println("创建功能");
        //需求：在D盘下创建2.txt文件
        File file5 = new File("/Users/yinrui/Documents/2.txt");
        boolean flag1 = file5.createNewFile();
        System.out.println(flag1);

        //需求：在D盘下创建a文件夹
        File file6 = new File("/Users/yinrui/Documents/a");
        boolean flag2 = file6.mkdir();  //make directory，创建单级目录
        System.out.println("flag2:" + flag2);

        //需求：在D：盘下创建a/b/c文件夹
        File file7 = new File("/Users/yinrui/Documents/a/b/c");
        boolean flag3 = file7.mkdirs();     //创建多级目录（也可以创建单级目录）
        System.out.println("flag3:" + flag3);
        System.out.println("=======================");
        System.out.println("测试判断功能");
        File file8 = new File("/Users/yinrui/Documents/2.txt");
        System.out.println("测试file8是否是文件夹"+file8.isDirectory());
        System.out.println("测试file8是否是文件"+file8.isFile());
        System.out.println("测试file8是否存在"+file8.exists());
    }
}
