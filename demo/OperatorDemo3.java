package cn.itcast.demo;
/*
   不参与运算：都一样
   参与运算：
        在变量前，先自增，再以新值进行其他运算
        在变量后，先以原值进行其他运算，再自增
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a = 5;
        //单独使用
//        a++;
//        ++a;
//        下述输出语句的结果是：把字符串"a："和变量a的值进行拼接
//        System.out.println("a:"+a);
//        参与运算
//        ++在后
/*        int b = a++;
        System.out.println("a:"+a); //6
        System.out.println("b:"+b); //5
*/

//        ++在前
        int b = ++a;
        System.out.println("a:"+a); //6
        System.out.println("b:"+b); //6

    }
}
