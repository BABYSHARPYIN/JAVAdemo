package cn.itcast.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        /**
         * 需求：
         *  系统产生一个1-100之间的随机数，请猜出这个数是多少
         *
         * 分析：
         *  随机产生一个1-100之间的数字
         *
         *  键盘录入我们要猜的数据
         *
         *  比较两个数据，看我们猜的是否正确
         */
        Random r = new Random();
        int i = r.nextInt(100) + 1;//生成1-100之间的随机数
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个1-100之间的数字");
            int j = sc.nextInt(); //接收键盘录入对象
            if (j < i) {
                System.out.println("你猜的太小了");
            } else if (j > i) {
                System.out.println("猜的太大了");
            } else {
                System.out.println("你猜对了：" + i);
                //猜对了，循环结束
                break;
            }
        }
    }
}
