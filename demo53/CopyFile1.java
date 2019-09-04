package cn.itcast.demo53;

import java.io.*;

/*
    字符缓冲流用法：
        分类：
            BufferedReader:字符缓冲输入流（也叫高效字符输入流）
                构造方法：
                    public BufferedReader(Reader reader);

            BufferedWriter:字符缓冲输出流（也叫高效字符输出流）
                构造方法：
                    public BufferedWriter(Writer writer);

        特点：
            字符缓冲流自带有缓冲区，大小为8192个字节，也就是16KB
 */
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符缓冲流，将1.txt文件中的内容拷贝到2.txt文件中
        //1、创建字符缓冲输入流对象，关联数据源文件
       /* //1.1 创建普通的字符输入流对象
        FileReader fr = new FileReader("lib/1.txt");
        //1.2 创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("lib/1.txt"));
        */
        BufferedReader br = new BufferedReader(new FileReader("lib/1.txt"));


        //2、创建字符缓冲输出流对象，关联数据源文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/2.txt"));
        //3、定义变量，记录读取到的数据
        int len;
        //4、循环读取，只要满足条件就一直读，并将读取到的内容赋值给变量
        while ((len = br.read())!= -1){
            //5、读取到的数据写入到目的地文件中
            bw.write(len);
        }

        //6、释放资源
        br.close();
        bw.close();
    }
}
