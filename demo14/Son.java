package cn.itcast.demo14;

public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
//        f.show1();
        f.show2();
        f.show3();
        f.show4();
        System.out.println("================");
        Son son = new Son();
        son.show2();
        son.show3();
        son.show4();
    }
}
