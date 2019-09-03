package cn.itcast.demo40;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        //需求：测试列表迭代器
        //1、创建列表对象
        List list = new ArrayList();
        //2、创建元素对象
        //3、将元素对象添加到集合对象中
        list.add("a");
        list.add("b");
        list.add("c");
        //需求：判断集合中如果有字符串"b"，就在其后边添加一个新的字符串：java
        //1、根据集合对象获取列表迭代器对象
        ListIterator lit = list.listIterator();
        //2、判断迭代器中是否有元素
        while (lit.hasNext()){
            //3、有就获取元素即可
            String s = (String)lit.next();
            if ("b".equals(s)){
                //如果元素中有元素"b"
                //list.add("java"); //这样写不行，必须调用列表迭代器的方法实现
                lit.add("java");
            }
            System.out.println(s);
        }
        System.out.println("=====================");
        System.out.println(list);
    }
}
