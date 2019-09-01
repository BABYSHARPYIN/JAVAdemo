package cn.itcast.demo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /*
            需求：打印数组中的指定元素

            操作数组中元素的格式：
                数组名[索引],索引是从0开始的，往后++；

         */
        //1、定义一个数组
        int[] arr = {11, 22, 33};
        //需求1：输出第三个元素的值(它的索引是2)
        System.out.println(arr[2]);
        //需求2：将数组中第一个元素的值改为10，然后输出；
        arr[0] = 10;
        System.out.println(arr[0]);
    }
}