package cn.itcast.demo16;
//子类，狗类
public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println(getName()+"吃骨头");
    }
}
