package cn.itcast.demo21;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        //测试程序员类
        Employee e = new Coder();
        e.work();
        //测试经理类
        Employee e1 = new Manager();
        e1.work();
        System.out.println("====================");
        //扩展内容，快速实例化对象
        //需求：创建一个姓名叫张三，工资为5000，工号为007的程序员
        Coder c = new Coder("张三", 30000, 007);
        /*
        c.setName("张三");
        c.setSalary(30000);
        c.setId(007);
         */
        System.out.println("姓名：" + c.getName());
        System.out.println("薪水：" + c.getSalary());
        System.out.println("工号：" + c.getId());
        System.out.println("======================");

        //需求：创建一个名字叫李四，工资为40000 工号为001，奖金为1000
        Manager m = new Manager("李四",4000,001,1000);
        System.out.println("姓名：" + m.getName());
        System.out.println("薪水：" + m.getSalary());
        System.out.println("工号：" + m.getId());
        System.out.println("奖金"+m.getBonus());




    }
}
