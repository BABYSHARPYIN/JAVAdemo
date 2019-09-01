package cn.itcast.demo5;
/*
    定义一个学生类
 */
public class Student {
    //构造方法
    //无参构造
    public Student(){}
    //带参构造
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    //成员变量
    private String name;
    private int age;
    //设置姓名
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //设置年龄
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
