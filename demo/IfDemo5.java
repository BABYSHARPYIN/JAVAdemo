package cn.itcast.demo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        //1、创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2、定义变量
        //3、提示用户输入数据
        System.out.println("请输入学生成绩");
        int a = sc.nextInt();
        //4、写判断条件，判断等级，并再控制台输出
        if (a>=90&&a<=100){
            System.out.println("皇帝");
        }else if (a>=80&&a<90){
            System.out.println("宰相");
        }else if (a>=70&&a<80){
            System.out.println("大臣");
        }else if (a>=60&&a<70){
            System.out.println("县官");
        }else if (a<60&&a>=0){
            System.out.println("草民");
        }else{
            System.out.println("非法数据");
        }

    }
}
