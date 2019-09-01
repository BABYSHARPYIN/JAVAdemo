package cn.itcast.demo;
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[] args) {
        //创建一个Scanner类
        Scanner sc = new Scanner(System.in);
        //提示
        System.out.println("请输入一个整数：");
        //接收用户输入的数据
        int a = sc.nextInt();
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();
        System.out.println("它们的和是：");
        System.out.println(a+b);
    }
}
