package cn.itcast.demo;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 5;
        int b = 3;
        System.out.println(a + b); //输出8
        System.out.println(a - b); //输出2
        System.out.println(a * b); //输出15
        System.out.println(a / b); //输出1 商1余2 java中整数相除只取商
        System.out.println(a % b); //输出2
        System.out.println("------------------------");

        System.out.println(5 / 4); //输出1
        System.out.println(5.0 / 4); //输出1.25
        System.out.println(5 / 4.0); //输出1.25
        /*
            想要得到小数的结果则需要浮点数参与运算
         */

    }
}
