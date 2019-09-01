package cn.itcast.demo16;

/*
    已知父类animal，成员变量为：姓名 成员方法为：eat()方法
    它有两个子类Dog类、Mouse类，两个子类都重写了Animal类中的eat()方法
    在测试类中，定义showAnimal()方法，用来测试Dog类和Mouse类
 */
public class Test {
    public static void main(String[] args) {

        //用来测试Dog类和Mouse类
        Dog d = new Dog();
        d.setName("哈士奇");
        showAnimal(d);
        Mouse m = new Mouse();
        m.setName("Jerry");
        showAnimal(m);
    }
    //需求：在该类中定义showAnimal方法，用来测试Dog类和Mouse类
    //传统做法
    /*public static void showAnimal(Dog d){
        d.eat();
    }
    public static void showAnimal(Mouse m){
        m.eat();
    }*/

    //多态的做法
    //多态的使用场景，父类型可以作为形参的数据类型
    //这样可以接收其任意的子类对象
    public static void showAnimal(Animal an){
        an.eat();
    }
}
