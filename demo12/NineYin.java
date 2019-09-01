package cn.itcast.demo12;
/*
    子类
 */
public class NineYin extends Martial{
    //练习内功
    public void internalStrength(){
        //调用父类的成员方法
        super.internalStrength();
        System.out.println("以柔克刚");
    }
    public void stroke(){
        System.out.println("九阴白骨爪");
    }
}
