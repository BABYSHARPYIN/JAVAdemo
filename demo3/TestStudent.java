package cn.itcast.demo3;

public class TestStudent {
    public static void main(String[] args) {
        /*
            private：
                概述：
                    private一般用来修饰成员变量
                特点：
                    被他修饰的成员只能在本类中访问
                结论：
                    private一般用来修饰成员变量
                    public一般用来修饰成员方法
         */

        //新建对象s
        Student s = new Student();
        s.name = "尹锐";
        //设置值
        s.setAge(20);
        //调用并获取值
        System.out.println(s.getAge());//调用getAge公共方法
        s.study();//调用study方法
    }
}
