package cn.itcast.demo;

public class OperatorDemo2 {
    public static void main(String[] args) {
         //字符的加法运算
        //定义两个变量，int,char
        int a = 10;
        char ch = 'a'; //97
        System.out.println(a+ch); //107

        //字符串的加法运算
        System.out.println("hello" + "world"); //"helloworld"
        System.out.println("hello" + 10); //"hello10"
        System.out.println("hello" + 10 + 20);//"hello10"+20 => "hello1020"
        System.out.println(10+20+ "hello");//30 + "hello" => "30hello"
    }
}
