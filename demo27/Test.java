package cn.itcast.demo27;

/*
    接口中的成员特点：
        成员变量：
            接口中只有成员常量，没有成员变量
            原因是因为接口中所有的变量都有默认修饰符：public static final
        成员方法：
            JDK7及以前，可以有带方法体的方法了
            静态方法直接写，非静态方法要用default修饰

            JDK9以后，可以有私有方法了，直接写即可

        构造方法：
            接口中没有构造方法
 */
public class Test {
    public static void main(String[] args){
    //测试接口中的成员常量
//        USB.NUM = 20; 这样写代码会报错，常量的值不能修改
        System.out.println(USB.NUM);

    }
}
