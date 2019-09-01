package cn.itcast.demo23;

public class Test {
    /*
    *  Static关键字：
    *       该单词是"静态"的意思，可以用来修饰成员变量和成员方法，
    *       关于Static修饰的成员变量：
    *           该变量叫静态变量（类变量），静态变量被该类下所有的对象所共享，
    *       静态成员的调用方式：
    *            可以通过 类名.的形式直接调用
    *       需求：定义研发部成员类，让每位成员进行自我介绍
    *             Developer类：
    *                 成员变量：姓名name,工作内容work，部门名字deparmentName
    *                 成员方法：进行自我介绍的方法selfIntroduction();
    */
    public static void main(String[] args) {
        //需求：创建两个员工然后测试
        Developer d1 = new Developer();
        d1.name = "小黑";
        d1.work = "写代码";
        d1.selfIntroduction();

        Developer d2 = new Developer();
        d2.name = "媛媛";
        d2.work = "鼓励师";
        d2.selfIntroduction();

        System.out.println("===============");
        //随着公司的发展，部门名字要进行调整，改为：开发部
        //Developer.departmentName = "开发部";
        d1.selfIntroduction();
        d2.selfIntroduction();
    }
}
