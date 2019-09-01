package cn.itcast.demo6;

public class TestStudent {
    public static void main(String[] args) {
        //需求：通过空参创建对象
        Student stu1 = new Student();
        stu1.setAge(20);
        stu1.setName("空参");
        System.out.println(stu1.getAge());
        System.out.println(stu1.getName());
        System.out.println("======================");
        //需求：通过全参创建对象
        Student stu2 = new Student("全参",12);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
    }
}
