package cn.itcast.demo6;

/*
    定义一个标准的JavaBean类
 */
public class Student {
    //成员变量：全用private修饰
    //姓名
    String name;
    //年龄
    int age;

    //构造方法：无参构造，全参构造
    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //公共的访问方法：getXXX() setXXX()
    //设置姓名

    public void setName(String name) {
        this.name = name;
    }

    //获取姓名

    public String getName() {
        return name;
    }

    //设置年龄

    public void setAge(int age) {
        this.age = age;
    }

    //获取年龄

    public int getAge() {
        return age;
    }
}
