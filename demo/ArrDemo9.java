package cn.itcast.demo;

public class ArrDemo9 {
    public static void main(String[] args) {
        /*
            结论：
            1、基本类型的变量作为参数传递时，传递的是值（相当于复制一份值）
            2、引用类型的变量作为参数传递时，传的是地址值（相当于共享值）
         */
        int x = 3;
        int y = 4;
        int z = sum(x,y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static int sum(int a ,int b){
        int c = a+b;
        a++;
        b++;
        return c;
    }
}
