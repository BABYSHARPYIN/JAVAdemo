package cn.itcast.demo11;

public class Test {
    public static void main(String[] args) {
        /*
            使用变量遵循就近原则
                现在局部位置找，有就使用，没有就去本类的成员位置找
                有就使用，没有就去父类找，有就使用，没有就报错

                如果局部变量、本类的成员变量、父类的成员变量重名了。如何解决？
                本类的成员变量：this.xxx
                父类的成员变量：super.xxx

         */
        Zi z = new Zi();
        z.show();
    }
}
