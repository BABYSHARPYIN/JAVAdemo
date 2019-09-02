package cn.itcast.demo31;

/*
    String类：
    概述：
        字符串，每一个字符串对象都是常量
    构造方法：
String(byte[]):
	构造一个String对象，将指定字节数组中的数据转换成字符串

String(char[]):
	构造一个String对象，将指定字符数组中的数据转换成字符串

成员方法
boolean equals(String):
	判断当前字符串与给定字符串是否相同，区分大小写
boolean equalsIgnoreCase(String)
	判断当前字符串与给定字符串是否相同，不区分大小写
boolean startsWith(String)
	判断是否以给定字符串开头
boolean isEmpty();
    判断字符串是否为空
 */
public class Test {
    public static void main(String[] args) {
        //测试 构造方法
        //1.将指定的字节数组转成字符串
        //'a':97
        byte[] bys = {97,98,99};
        String s1 = new String(bys);
        System.out.println("s1:"+s1);
        //2.将指定的字符数组转成字符串
        char[] chs = {'h','e','l','l','o'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);
        //补充：在实际开发中，String类非常非常常用，每次都new很麻烦，于是针对String的语法做了优化，省去了new的动作
        String s3 = "abc"; //免new
        System.out.println("======================");

        //测试成员方法
        String str1 = "abc";
        String str2 = "ABC";
//      boolean equals(String)判断当前字符串与给定字符串是否相同，区分大小写
        boolean b1 = str1.equals(str2);
        System.out.println("equals():"+b1);
//      boolean equalsIgnoreCase(String) 判断当前字符串与给定字符串是否相同，不区分大小写
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println("equals():"+b2);
//      boolean startsWith(String) 判断是否以给定字符串开头
        boolean b3 = str1.startsWith("a");
        System.out.println("startsWith():"+b3);
//      boolean isEmpty(); 判断字符串是否为空
        boolean b4 = str1.isEmpty();
        System.out.println("isEmpty():"+b4);

    }
}
