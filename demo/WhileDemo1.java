package cn.itcast.demo;

/**
 * 需求，使用while循环在控制台输出5次"Helloworld"
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        //初始化语句
        int i = 0;
        //判断条件语句
        while (i<5){
            //循环体语句
            System.out.println("HelloWorld");
            //控制条件语句
            i++;
        }
    }
}
