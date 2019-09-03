package cn.itcast.demo42;

import cn.itcast.demo26.A;

import java.util.*;

/*
    Collection
        概述：
            针对集合进行操作的工具类

        成员方法：
            max(Collection<T>);     返回集合的最大元素
            sort(List<T>);          根据元素的自认顺序，将指定标按升序排序
            reverse(List<T>);       反转List集合元素
            shuffle(List<T>);       使用默认的随机源随机置换指定列表
 */
public class Test {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();
        //往集合中添加数据
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(4);
        //打印集合
        System.out.println("没有操作以前，集合中的数据是：" + list);
        System.out.println("=========================");
        //获取集合中最大元素
        Integer max = Collections.max(list);
        System.out.println("集合中的最大元素是：" + max);
        System.out.println("==========================");
        //对集合进行升序排列
        Collections.sort(list);
        System.out.println("升序排列的结果是：" + list);
        System.out.println("==========================");
        //对集合中的数据进行反转
        Collections.reverse(list);
        System.out.println("反转后集合中的数据为：" + list);
        System.out.println("==========================");
        //随机置换，相当于洗牌
        Collections.shuffle(list);
        System.out.println("随机置换后的结果为：" + list);
    }
}
