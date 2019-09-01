package cn.itcast.demo13;
/*
    测试类，用来演示构造方法的调用

    结论：
        子类所有的构造方法第一行都有一个默认的super()用来访问父类的无参构造方法
        如果父类没有无参构造，可以通过super(参数)的形式访问带参构造
 */
public class Test {
    public static void main(String[] args) {
        //创建子类对象
        Worker w = new Worker();
    }
}
