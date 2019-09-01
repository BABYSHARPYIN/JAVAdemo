package cn.itcast.demo15;
/*
    动物类案例：
        已知父类Animal，成员变量为：姓名，成员方法为：eat()方法
        其中一子类Dog类，请用该案例模拟多态
 */
public class Animal {
    private String name;
    //空参构造
    public Animal() {
    }
    //全参构造
    public Animal(String name) {
        this.name = name;
    }

    //getxxx setxxx

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //成员方法
    public void eat(){
        System.out.println("吃饭方法");
    }
}
