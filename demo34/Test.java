package cn.itcast.demo34;

/*
    StringBuilder和StringBuffer类
简介：
可变字符序列，用于构造字符串对象。内部使用自动扩容的数组操作字符串数据。StringBuilder和StringBuffer使用相同的API。
两个非常相似，StringBuilder运行效率比StringBuffer高，通常情况下使用StringBuilder。

构造方法：
StringBuilder();
    构造一个空的StringBuilder容器
StringBuilder(String);
    构造一个StringBuilder容器，并添加指定字符串
成员方法：
StringBuilder append(…);
        将任意数据添加到StringBuilder容器中
String toString();
        将当前StringBuilder容器转换成字符串

 */
public class Test {
    public static void main(String[] args) {
        //测试构造方法
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println("===========");
        //需求：将String类型的"abc"转换成StringBuilder类型的对象
        StringBuilder sb3 = new StringBuilder("abc");
        System.out.println(sb3);
        System.out.println("===========");
        //测试成员方法
        //需求：将三个字符串拼接成一个新的字符串：学JAVA，到传智播客，找小黑！
        StringBuilder sb4 = new StringBuilder();
        sb4.append("学JAVA,");
        sb4.append("到传智播客");
        sb4.append("找小黑！");
        System.out.println(sb4);
        System.out.println("=================");
        String s = sb4.toString(); //将StringBuilder类型的数据转换成字符串类型的数据
        System.out.println(s);
    }
}
