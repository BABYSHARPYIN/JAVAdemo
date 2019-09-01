package cn.itcast.demo19;

public class Dog extends Animal{
    //抽象方法要求子类重写方法 快捷键自动重写ALT+ENTER
    @Override
    public void eat() {
        System.out.println("狗恰骨头");
    }


}
