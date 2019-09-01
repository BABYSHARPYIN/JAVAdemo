package cn.itcast.demo13;
//子类
public class Worker extends Person {
    public Worker(){
//        super(); //用于初始化父类成员
        super("小黑");
        System.out.println("Worker类的空参构造");
    }
}
