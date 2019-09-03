package cn.itcast.demo41;

import java.util.ArrayList;
import java.util.List;

/*
    泛型：
        概述：
            即泛指任意类型，又叫参数化类型(ParameterizedType)，对具体类型的使用起到辅助作用，类似于方法的参数。

            集合类泛型的解释
                表示该集合中存放指定类型的元素

        好处：
            类型安全
            避免了类型转换

        总结：
            泛型一般只和集合类相结合使用
            泛型是JDK5的新特性，但是从JDK7开始，后边的泛型可以不用写具体的数据类型了（菱形泛型）
 */
public class Test {
    public static void main(String[] args) {
        //不使用泛型的集合
        //1、创建集合对象
        List list1 = new ArrayList();
        //2、创建元素对象
        //3、将元素对象添加到集合对象中
        list1.add("a");
        list1.add("b");
        list1.add("c");
        //list1.add(10);   会报类型转换异常（ClassCastException）
        //4、遍历集合
        for (Object obj : list1) {
            String s = (String)obj;
            System.out.println(s);
        }
        System.out.println("=================");
        //需求：演示泛型
        //1、创建集合对象
        List<String> list2 = new ArrayList<>();
        //2、创建元素对象
        //3、将元素对象添加到集合对象中
        list2.add("avc");
        list2.add("adf");
        list2.add("as");
        //list1.add(10);   会报类型转换异常（ClassCastException）
        //4、遍历集合
        for (String s : list2) {
            System.out.println(s);

        }
    }
}
