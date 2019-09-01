package cn.itcast.demo12;
/*
    父类 武功类
    四大权限修饰符的修饰范围从小到大分别是
    private ,默认（什么都不写就是默认），protected(受保护的),public（公共的、公开的）
 */
public class Martial {
    //练习内功
    public void internalStrength(){
        System.out.println("练习内功");
    }
    //练习招式
    public void stroke(){
        System.out.println("练习招式");
    }
}
