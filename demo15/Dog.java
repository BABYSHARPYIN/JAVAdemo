package cn.itcast.demo15;
//他是animal类的子类
public class Dog extends Animal{
    //需求：因为狗吃骨头，所以要优化父类的eat()方法
    //方法重写的意思
    @Override
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
}
