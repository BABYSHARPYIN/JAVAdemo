package cn.itcast.demo;

import java.util.Random;

public class RandomDemo1 {
    //需求：获取一个随机数
    public static void main(String[] args) {
        //1、创建Random类的对象（包含：导包，创建对象）
        Random r = new Random();
        //2、通过r.nextInt(int数字)的方式获取随机数
        /*int num = r.nextInt(10);    //10的意思是：获取随机数的范围是0-10之间的数字，包含0，不包含10 （前闭后开）
        System.out.println(num);*/

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);    //10的意思是：获取随机数的范围是0-10之间的数字，包含0，不包含10 （前闭后开）
            System.out.println(num);

        }
    }
}
