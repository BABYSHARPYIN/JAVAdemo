package cn.itcast.demo;

/**
 * 关系运算符
 *  分类：
 *      ==,!=,>,>=,<,<=
 *
 *  运算结果：
 *      关系运算符操作完毕后的结果肯定是boolean类型
 *
 *  注意事项：
 *      千万不用把==写成了=
 */

public class OperatorDemo5 {
    public static void main(String[] args) {
        //定义三个变量
        int a = 10;
        int b = 20;
        int c = 10;

        //==;等于
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        System.out.println("-----------------------------");

        //!=;不等于
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        System.out.println("-----------------------------");

        //>;大于
        System.out.println(a > b); //false
        System.out.println(a > c); //false
        System.out.println("-----------------------------");

        //>=;大于等于
        System.out.println(a >= b); //false
        System.out.println(a >= c); //true
        System.out.println("-----------------------------");
    }
}
