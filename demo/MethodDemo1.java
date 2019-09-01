package cn.itcast.demo;

import org.w3c.dom.ls.LSOutput;

/*
    方法的定义格式：
        修饰符 返回值的类型 方法名（参数类型 参数名1，参数类型 参数名2...){
            方法体语句;
            return 返回值;
        }
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        /*
            调用方法注意事项：
                1、可以根据方法名直接调用方法
                    //通俗来讲，调用那个方法，就写该方法的名字
                2、方法要什么，就传入什么值
                3、方法返回什么，你就用什么类型的变量来接收
         */
        int x = sum(3,4);
        System.out.println(x);

    }

    /*
        注意：
            方法和方法之间是平级的关系，不能嵌套定义。
            要定义方法，注意三个明确：
                明确方法名
                明确返回值的类型
                明确参数列表
     */
    //需求：定义一个方法，用来获取两个整数的和
    public static int sum(int a, int b) {
        //方法体语句，其实就是具体的运算过程了
        int c = a + b;//c就是击落两个数的和
        return c; //返回计算的结果
    }

}
