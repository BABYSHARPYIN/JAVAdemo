package cn.itcast.demo52;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流拷贝文件，一次写一个字符数组
        //例如：将1.txt文件中的内容复制到2.txt中
        /*
            IO流核心6步：
                1、创建字符输入流对象，关联数据源文件
                2、创建字符输出流对象，关联目的地文件
                3、创建比噢按量，用来记录读取到的有效字符数
                4、通过循环进行读取，只要条件满足就一直读，并将读取到的有效数赋值给变量
                5、将读取到的数据写入到目的地文件中
                6、释放资源
         */
        //1
        FileReader fr = new FileReader("lib/1.txt");
        //2
        FileWriter fw = new FileWriter("lib/2.txt");
        //3
        char[] chs = new char[1024];
        int len;
        //4
        while ((len = fr.read(chs))!=-1){
            //5
            fw.write(chs,0,len);
        }
        //6
        fr.close();
        fw.close();
    }
}
