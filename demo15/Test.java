package cn.itcast.demo15;

/*
    动物类案例：
        已知父类Animal，成员变量为：姓名，成员方法为：eat()方法
        其中一子类Dog类，请用该案例模拟多态
 */
public class Test {
    public static void main(String[] args) {
        //演示多态
        /*
            实现多态的三个步骤：
            1、要有继承（或者实现）关系
            2、要有方法重写
            3、要有父类引用，指向子类对象
         */
        Animal an = new Dog(); //父类引用指向子类对象
        an.setName("哈士奇");
        an.eat();

    }
}
