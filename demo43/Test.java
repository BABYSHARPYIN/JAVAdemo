package cn.itcast.demo43;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    单列集合(Collection)之set集合
        特点：
            无序（元素的存取顺序不一致），唯一
        结论：
            set集合保证元素的唯一性依赖：equals()和hashCode()两个方法
 */
public class Test {
    public static void main(String[] args) {
        //需求：往set集合中添加5哥学生对象，然后遍历
        //1、创建集合对象
        Set<Student> set = new HashSet<>();
        //2、创建元素对象
        Student s1 = new Student("乔峰",18);
        Student s2 = new Student("虚竹",28);
        Student s3 = new Student("段誉",38);
        Student s4 = new Student("乔峰",18);
        Student s5 = new Student("虚竹",28);
        //3、将元素对象添加到集合对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        //4、遍历集合
        /*
            为什么set集合没有"去重"？
                因为set集合保证元素的唯一性依赖：equals()和hashCode()两个方法
                我没有在Student类中重写这两个方法，默认调用的是Object类中的这两个方法
                而Object类中的equals()方法默认比较的是地址值是否相同。

            解决方案：
                在Student中重写equals()和hashCode();
         */
        System.out.println(set);
        System.out.println("================");
        System.out.println("通过迭代器来实现");
        //通过迭代器遍历set集合
        //1、通过集合对象获取其对用的迭代器对象
       Iterator<Student> it = set.iterator();
        //2、判断迭代器中是否有元素
        while (it.hasNext()){
            //3、如果有就获取元素
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("================");
        //通过增强for遍历set集合
        System.out.println("通过增强for来实现");
        for (Student student : set) {
            System.out.println(student);
        }

    }
}
