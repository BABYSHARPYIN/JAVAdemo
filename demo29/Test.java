package cn.itcast.demo29;
/*
    需求：定义一个标准的JavaBean类，并再测试类中进行测试
        学生类：Student
            属性：id（编号），name（名字），score（成绩）

    注意：
        实际开发中，我们把两个对象的各个属性值都相同的情况下，才会认为这两个对象是同一个对象
 */
public class Test {
    public static void main(String[] args) {
    //测试toString()方法
        //创建学生类对象
        Student s1 = new Student(1,"欧阳修",66);
        //输出语句直接打印对象，默认调用了该对象的toString()方法
        System.out.println(s1);

        //测试equals()方法
        Student s2 = new Student(1,"欧阳修",66);
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
    }
}
