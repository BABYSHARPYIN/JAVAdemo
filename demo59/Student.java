package cn.itcast.demo59;

//学生类
public class Student {
    //公共的空参方法
    public void show1() {
        System.out.println("我是公共的空参方法");
    }

    //公共的带参方法
    public void show2(int a) {
        System.out.println("我是公共的带参方法，您打印的a值是：" + a);
    }

    //私有的带参方法
    private int show3(int a , int b) {
        System.out.println("我是私有的带参方法");
        return a+b;

    }
}
