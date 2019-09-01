package cn.itcast.demo;

import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) { //只有void才可以没明确的返回值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean x = compare(a,b);
        System.out.println(x);
        return;//return语句代表方法的结束
    }//main方法结束标记


    public static boolean compare(int a,int b){
        /**
         * 需求：
         *  键盘录入两个整数，比较他们是否相同
         */
//        return 10;//这样写不行，因为返回值的类型必须和return后面的值类型一致
        return a==b;
    }//compare方法结束标记
}

