package cn.itcast.demo54;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流的用法：
        FileInputStream：普通的字节输入流，用来读取数据的
            构造方法：
                public FileInputStream(String pathname);
            成员方法：
                public int read();  一次读取一个字节，并返回读取到的内容，读不到返回-1

        FileOutputStream：普通的字节输出流，用来写数据的
            构造方法：
                public FileOutputStream(String pathname);
            成员方法：
                public void writer(int len);    一次写入一个字节
 */
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //需求：通过普通的字节流，一次读写一个字节的方式，将a.jpg复制到b.jpg中
        //1、创建字节输入流，关联数据源文件
        FileInputStream fis = new FileInputStream("lib/a.jpg");
        //2、创建字节输出流，关联目的地文件
        FileOutputStream fos = new FileOutputStream("lib/b.jpg");
        //3、定义变量，用来记录读取到的内容
        int len;
        //4、循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
        while ((len = fis.read())!=-1){
            //5、将读取到的内容写入到目的地文件中
            fos.write(len);
        }
        //6、释放资源
        fis.close();
        fos.close();
    }
}
