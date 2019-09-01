package cn.itcast.demo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /**
         * 需求：
         *  给定一个int型数组，输出数组中的每一个元素
         * 分析：
         *  1、使用格式一定义一个长度为5的int型数组
         *  2、为数组的前三个元素分别赋值为1、2、3
         *  3、使用循环遍历数组
         *      数组的长度：数组名.length
         */
        int[] arr =new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //3.通过for循环来遍历数组，打印每个数组的值
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("数组的长度是："+arr.length);
        System.out.println("数组索引的最大长度是："+(arr.length-1));
    }
}
