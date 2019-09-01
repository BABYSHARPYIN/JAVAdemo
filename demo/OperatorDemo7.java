package cn.itcast.demo;

/**
 * 三元运算符：
 *      概述：
 *          也叫三目运算符，即由三部分组成的
 *
 *      格式：
 *      关系表达式?表达式1:表达式2;
 *
 *      执行流程：
 *          先判断关系表达式是否成立，
 *              成立，执行表达式1；
 *              不成立，执行表达式2；
 */
public class OperatorDemo7 {
    public static void main(String[] args) {
//    需求：求两个整数的最大值
//    1、定义两个变量记录两个整数
        int a = 10;
        int b = 20;
//    通过三元运算计算他们的最大值
        int max = (a>=b)?a:b; //三元运算符问号后面是表达式 这行代码表示比较ab的大小，如果a大于b则执行表达式1否则执行表达式2，然后赋值给max变量
//    3、将结果打印到控制台上
        System.out.println("max:"+max);
    }
}
