package cn.itcast.demo2;
/*
    这是一个学生类的测试类

    局部位置：
        方法的参数列表 或者 方法体语句（方法内部）
    成员位置：
        类中，方法外

    JAVA中使用变量的规则
        使用变量遵循"就近原则"，如果局部位置有，则使用
 */
public class TestStudent {
    //生成主入口
    public static void main(String[] args) {
        //创建学生类对象
        Student s = new Student();
        //给成员变量赋值，并打印结果
        s.name = "尹锐";
        s.age = 20;
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println("===============");
        //调用成员方法
        s.study();

    }
}
