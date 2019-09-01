package cn.itcast.demo1;
/*
    定义一个手机类
 */
public class Phone {
    //成员变量：定义在类中，方法外的变量

    //品牌
    String brand;
    //型号
    String model;
    //名称
    String name;
    //成员方法，先不写static修饰符
    //打电话
    public void call (String name){
        System.out.println("给"+name+"打电话");
    }
    //发短信
    public void sendMessage(){
        System.out.println("发短信");
    }
    //玩游戏
    public void playGames(){
        System.out.println("玩游戏");
    }
}
