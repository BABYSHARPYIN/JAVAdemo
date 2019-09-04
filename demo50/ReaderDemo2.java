package cn.itcast.demo50;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
    字符流读数据
        Reader类中的方法：
            int read(char[] chs);       一次读一个字符数组，将读取到的内容存入到数组中，
                                        并返回读取到的有效字符数，读不到返回-1

        FileReader类的构造方法：
            public FileReader(String pathname); 根据传入的字符串形式的路径，获取字符输入流对象

 */
public class ReaderDemo2 {
    public static void main(String[] args) throws IOException {

        //需求：通过字符流读取数据，一次读取一个字符组
        //1、创建字符输入流对象
        Reader reader = new FileReader("lib/2.txt");
        //2、读取数据
        /*
        char[] chs = new char[3];   // , ,
        int len1 = reader.read(chs);
        System.out.println(chs);    //a,b,c
        System.out.println(len1);   //3


        int len2 = reader.read(chs);
        System.out.println(chs);    //d,e,f
        System.out.println(len2);   //3

        int len3 = reader.read(chs);
        System.out.println(chs);    //g,e,f
        System.out.println(len3);   //3

        int len4 = reader.read(chs);
        System.out.println(chs);    //g,e,f
        System.out.println(len4);   //-1
         */
        /*
            优化上述的代码，while循环
         */
        //定义字符数组
        char[] chs = new char[3];
        //记录读取到的有效字符数
        int len;
        while((len = reader.read(chs))!=-1){
            //将读取到的内容,转换成字符串然后打印
            /*
                chs：表示要操作的数据
                0：表示起始索引
                len:表示要操作的字符的个数
             */
            String s = new String(chs,0,len);   //[g,e,f],0,1
            System.out.println(s);
        }
        //3、释放资源
        reader.close();
    }
}
