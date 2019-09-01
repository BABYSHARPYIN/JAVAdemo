package cn.itcast.demo;

public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始执行");
//        判断两个整数是否相等，相等则打印相等，不相等则打印不相等
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("它们两个是相等的");
        } else {
            System.out.println("他们两个不相等");
        }
        System.out.println("结束执行");
    }
}
