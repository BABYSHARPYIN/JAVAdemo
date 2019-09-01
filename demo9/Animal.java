package cn.itcast.demo9;
/*
    定义一个父类，里面放的是共性内容
 */
public class Animal {
    //成员变量
    private String name;//姓名
    private int age; //年龄
    private String sex;//性别

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //成员方法
    //吃饭
    public void eat(){
        System.out.println("会吃饭");
    }
}
