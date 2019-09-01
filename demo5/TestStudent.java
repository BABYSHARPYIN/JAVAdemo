package cn.itcast.demo5;
/*
    构造方法名：修饰符 构造方法名(参数列表){}
    构造方法名必须和类名完全相同（包括大小写）
    构造方法没有返回值，但是里面可以写return（表示构造方法结束）
    构造方法没有返回值类型
    一般会在类中写无参和带参构造，如果有带参构造，系统不会自动生成带参构造
 */
public class TestStudent {
    public static void main(String[] args) {
        //需求：定义一个姓名叫：张三 年龄为23的学生
        //格式一：通过无参构造实现
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(23);
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println("======================");
        //格式二：通过构造方法实现快速初始化
        Student stu2 = new Student("李四",24);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

    }
}
