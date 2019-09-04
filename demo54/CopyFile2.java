package cn.itcast.demo54;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流的用法：
        FileInputStream：普通的字节输入流，用来读取数据的
            成员方法：
                public int read(byte[] bys);  一次读取一个字节数组，
                                    并返回读取到的内容，读不到返回-1

        FileOutputStream：普通的字节输出流，用来写数据的
            成员方法：
                public void writer(byte[] bys,int index,int len);    一次写入一个指定的字节数组
 */
public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //需求：通过普通字节流一次读写一个字节数组的方式，将a.jpg复制到b.jpg中
        //1、创建字节输入流对象
        FileInputStream fis = new FileInputStream("lib/a.jpg");
        //2、创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("lib/b.jpg");
        //3、定义变量，接收读取到的内容
        byte[] bys = new byte[1024];
        //用来记录读取到的有效字节数
        int len;
        //4、循环读取，只要条件满足就一直读（并将有效字节数）赋值给变量
        while((len = fis.read(bys))!=-1){
            //5、将读取到的数据写入到目的地文件中
            fos.write(bys,0,len);
        }
        //6、释放资源
        fis.close();
        fos.close();
    }
}
