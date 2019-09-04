package cn.itcast.demo55;

import java.io.*;

/*
   字节缓冲流的用法：
            BufferedInputStream:    字节缓冲输入流（也叫：高效字节输入流），用来读取数据的
                构造方法：
                    public BufferedInputStream(InputStream is);
                成员方法：
                    public int read();  一次读取一个字节，并返回读取到的内容，读取不到返回-1

            BufferedOutputStream:   字节缓冲输出流（也叫：高效字节输出流），用来写数据的
                构造方法：
                    public BufferedOutputStream(OutputStream os);
                成员方法：
                    public void writer(int len);    一次写入一个字节

            特点：
                字节缓冲流有自己的缓冲区，大小为8192个字节，也就是8KB

            总结：
                拷贝纯文本文件使用字符流，拷贝其他（图片、音频、视频等）使用字节流
 */
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //需求：通过字节缓冲流，将a.jpg复制到b.jpg中;
        //1、创建字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/a.jpg"));
        //2、创建字节输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/b.jpg"));
        //3、定义变量
        int len;
        //4、循环读取
        while ((len = bis.read())!= -1){
            bos.write(len);
        }
        //5、关闭资源
        bis.close();
        bos.close();
    }
}
