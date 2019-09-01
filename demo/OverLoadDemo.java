package cn.itcast.demo;

public class OverLoadDemo {
    public static void main(String[] args) {

        /*
            方法重载的概念：
                同一页中的多个方法，出现方法名相同，但是参数列表不同的情况
                参数列表不同：
                    参数的个数不同
                    参数的对应数据类型不同
                方法重载与方法的返回值无关
         */
        //需求：定义方法，分别比较两个int/long/double的数据，判断它们是否相同
        //调用比较两个int类型数据的方法
        int a = 10;
        int b = 20;
        boolean x = compare(a,b);
        System.out.println(x);
        System.out.println("========================");
        //调用比较两个long类型数据的方法
        long a1 = 10L;
        long b1 = 20L;
        boolean x1 = compare(a1,b1);
        System.out.println(x1);
        System.out.println("=========================");
        //调用比较两个double类型数据的方法
        double a2 = 2.1;
        double b2 = 2.1;
        boolean x2 = compare(a2,b2);
        System.out.println(x2);
        System.out.println("=======================");

    }
    //定义一个方法：比较两个int类型的数据是否相同
    public  static boolean compare(int a,int b){
        System.out.println("判断两个int类型的数据是否相同");
        return a==b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("判断两个long类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(double a, double b) {
        System.out.println("判断两个double类型的数据是否相同");
        return a == b;
    }
}