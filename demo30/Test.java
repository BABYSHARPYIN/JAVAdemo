package cn.itcast.demo30;

import java.util.Scanner;

/*
  Scanner类：
    概述：
        扫描器，能够解析字符串（String）和基本数据类型的数据
    构造方法
Scanner（InputStream）:
		构造一个扫描器对象，从特定输入流中获取数据参数System.in，对应i 键盘录入
    成员方法
hashNextXxx():
		判断是否还有下一个输入项，其中Xxx可能是任意基本数据类型，返回结果为布尔行
nextXxx():
		获取下一个输入项，其中Xxx可能是任意基本数据类型，返回对应数据的类型
String nextLine():
		获取下一行数据。以换行符作为分隔符。
String next():
		获取下一个输入项，以空白字符作为分隔符
		空白分隔符：空格、tab、回车等
注意：
        在实际开发中，应用到的最多最多的方法就是：
            hasNextXxx();   判断是否有下一个指定类型的数据
            nextInt();      接收整数
            nextLine();     接收字符串（结束标记：换行符）
            next();         接收字符串（结束标记：空白字符）
 */
public class Test {
    public static void main(String[] args) {
        //创建Scanner类型的对象（注意：要导包）
        //System.in:标准的输入流，默认指向键盘
        Scanner sc = new Scanner(System.in);
        //接收整数
        /*
        System.out.println("请输入一个整数");
        //为了解决（避免）InputMismatchException异常，可以加入一个判断
        if (sc.hasNextInt()){//判断写一个录入的是否是整数，如果是，结果就是true
            int num = sc.nextInt();
            System.out.println("num:" + num);
        }else System.out.println("请输入一个整数");
         */
        //接收字符串类型的数据
        System.out.println("请录入一个字符串：");
        /*
        String str1 = sc.nextLine();    //结束标记是：换行符
        System.out.println("str1:" + str1);
         */
        String str2 = sc.next();        //结束标记：空白字符（空格，tab，换行符）
        System.out.println("str2:"+str2);

    }
}
