package cn.itcast.demo21;
//子类：程序员类
public class Coder extends Employee{
    //小细节，在实际开发中，子类一般都有两个构造方法
    //子类的空参构造访问父类的空参构造
    //子类的全参构造，访问父类的全参构造

    public Coder() {
    }

    public Coder(String name, int salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("程序员要敲代码");
    }
}
