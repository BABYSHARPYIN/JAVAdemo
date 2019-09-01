package cn.itcast.demo20;
//父类，动物类（抽象类）
public abstract class Animal {
    //构造方法

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    //成员变量：其值可变
    String name = "哈士奇";
    //成员常量：其值不能发生改变，通常使用大写命名
    final int AGE = 30;
    //吃
    public abstract void eat();
    //睡
    public abstract void sleep();

    public void call(String name){
        System.out.println(name+"会叫");
    }
}
