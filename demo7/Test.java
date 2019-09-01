package cn.itcast.demo7;
//测试类
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        //给对象C的姓名设置为：张三
        c.setName("张三");
        System.out.println(c.getName());
        /*
            JAVA中，子类只能继承父类的非私有成员（成员变量，成员方法）
         */
    }
}
