package cn.itcast.demo7;

//定义一个父类
public class Parent {
    private String name;
    private int age;

    //构造方法
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
