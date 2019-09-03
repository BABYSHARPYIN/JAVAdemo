package cn.itcast.demo40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    迭代器：
    概述
        对过程的重复，称为迭代。
        迭代器是遍历Collection集合的通用方式，可以在对集合遍历的同时进行添加、删除等操作。

        迭代器的常用方法：
            E next():返回迭代的下一个元素对象
            boolean hashNext():如果仍有元素可以迭代，则返回true

        注意：
            列表迭代器是List体系独有的遍历方式，可以在对集合遍历的同时进行添加、删除等操作
            但是必须通过调用列表迭代器的方法来实现

        使用步骤：
            1、根据集合对象获取其对应的迭代器对象
            2、判断迭代器中是否有元素
            3、如果有就获取元素

         总结：
            普通的迭代器在遍历集合的同时不能添加或者删除元素，否则会报并发修改异常
            列表迭代器在遍历集合的同时可以修改集合中的元素（添加，删除等），必须使用列表迭代器中的方法

 */
public class Test {
    public static void main(String[] args) {
        //需求：通过迭代器遍历List集合
        //1、创建集合对象
        List list = new ArrayList();
        //2、创建元素对象
        //3、将元素对象添加到集合对象中
        list.add("a");
        list.add("b");
        list.add("c");
        //4、遍历集合
        //迭代器的用法
/*
//        1、根据集合对象获取其对应的迭代器对象

       Iterator it = list.iterator();
//        2、判断迭代器中是否有元素
        while (it.hasNext()){//如果迭代器中有元素，就一致迭代
            //3、如果有就获取元素
//            Object obj = it.next();
            String s = (String)it.next();
            System.out.println(s);

 */
            System.out.println("=============");
            //需求：判断集合中如果有字符串"b"，就在其后边添加一个新的字符串：java
//          1、根据集合对象获取其对应的迭代器对象

        Iterator it = list.iterator();
//          2、判断迭代器中是否有元素
        while (it.hasNext()){//如果迭代器中有元素，就一致迭代
            //3、如果有就获取元素
//            Object obj = it.next();
            String s = (String)it.next();
            if ("b".equals(s)){ //常量写在前面，变量写在小括号里；这样写可以规避空指针异常
                //如果能走到这里，说明集合中有元素b
                //list.add("java");//这样写不行，会报ConcurrentModificationException（并发修改异常）
            }
            System.out.println(s);
        }

    }
}
