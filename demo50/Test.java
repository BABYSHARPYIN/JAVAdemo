package cn.itcast.demo50;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
    字符流读数据：
        Reader类中的方法：
            int read();     读一个字符，返回该字符对应的ASCII码值，对不到返回-1。

        FileReader类的构造方法：
            public FileReader(String pathname)     根据传入的字符串形式的路径，获取字符输入流对象
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流读取数据
        //1、创建字符输入流对象
        Reader reader = new FileReader("lib/1.txt");
        //2、读取数据
        /*
        int ch1 = reader.read();
        System.out.println(ch1);    //97

        int ch2 = reader.read();
        System.out.println(ch2);    //98

        int ch3 = reader.read();
        System.out.println(ch3);    //99

        int ch4 = reader.read();
        System.out.println(ch4);    //没有内容了，返回-1
         */
        /*
            优化上述的读法，用循环改进
            又因为不知道循环次数，所以用while循环
         */
        //定义变量，用来接收读取到的字符
        int ch;
        /*
            (ch = reader.read())!=-1 做了三件事
            1、执行reader.read()，去文件中读取一个字符
            2、ch = reader.read()，将读取到字符的ASCII码赋值给变量ch
            3、(ch = reader.read())!=-1  用读取到的字符和-1进行比较
         */
        while ((ch = reader.read())!=-1){
//            ch = reader.read();
            System.out.println(ch);
        }
        //3、释放资源
        reader.close();
    }
}
