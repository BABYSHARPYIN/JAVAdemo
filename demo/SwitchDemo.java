package cn.itcast.demo;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //需求：键盘录入数字，根据数字打印其对应的星期
        //1、创建键盘录入对象，以便接收用户录入的数字
        Scanner sc = new Scanner(System.in);
        //2、提示用户录入数字，并接收
        System.out.println("请录入一个数字，我来打印对应的日期：");
        int week = sc.nextInt();

        //3、根据用户录入的数字，打印对应的日期，通过switch来实现
        switch (week) {
            case 1:
                System.out.println("星期一");
                break;  //可以结束switch语句
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("非法值");
                break;
        }
    }
}
