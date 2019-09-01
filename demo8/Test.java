package cn.itcast.demo8;
/*
    需求：分别定义Dog类、Pig类
        它们共有的属性有：name、age、sex
        它们共有的行为有：eat()
        两者特有的行文分别是：watch()、snore()

     解决方案：
        方案一：传统代码（不使用继承）
        方案二：使用继承后的代码
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.watch();
        System.out.println("==========");
        //测试猪类
        Pig p = new Pig();
        p.eat();
        p.snore();
    }
}
