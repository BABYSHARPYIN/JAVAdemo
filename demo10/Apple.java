package cn.itcast.demo10;
//子类、苹果类
public class Apple extends Fruit{
    //成员变量
    int price = 10;
    public void showPrice(){
        int price = 5;

        System.out.println(price);
        System.out.println(this.price); //10
        System.out.println(super.price); //20
    }
}
