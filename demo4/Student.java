package cn.itcast.demo4;
/*
    定义一个学生类，用来演示this关键字
 */
public class Student    {
    //成员变量
    private int age = 20;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    //为了更好的理解this
    public void show(){
        //局部变量
        int age = 10;
        System.out.println(age);
        System.out.println(this.age);
    }
}
