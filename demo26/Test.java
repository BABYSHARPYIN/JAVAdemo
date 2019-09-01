package cn.itcast.demo26;
/*
    接口创建对象的特点：
1、接口不能实例化
	通过多态的方式实例化子类对象
2、接口的子类（实现类）
	可以是抽象类，也可以是普通类

接口中继承关系的特点：
	接口与接口之间的关系
		继承关系，可多继承，格式：
		接口extends接口1，接口2，接口3…
	继承和实现的区别
		继承体现的是”is a”的关系，父类中定义共性内容
		实现体现的是“like a”的关系，接口中定义扩展功能
 */
public class Test {
    public static void main(String[] args) {
    //测试鼠标类
        USB usb = new Mouse();
        usb.open();
        usb.close();
    }
}
