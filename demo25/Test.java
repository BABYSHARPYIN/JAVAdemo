package cn.itcast.demo25;
/*
    接口：
        就是提供的统一规则，规范：
        定义接口：
            interface接口名()
        类和接口之间是实现关系，用关键字implements来表示
            class类名implements接口名()
 */
public class Test {
    public static void main(String[] args) {
    //多态
        Smoking sm = new Teacher();
        sm.smoke();
    }
}
