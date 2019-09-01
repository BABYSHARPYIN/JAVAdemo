package cn.itcast.demo21;
//这是一个父类：员工类
public abstract class Employee {
    private String name;
    private int salary;
    private int id;
    //生成构造方法
    public Employee() {
    }

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    //getter setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //工作是抽象方法
    public abstract void work();
}
