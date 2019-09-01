package cn.itcast.demo;

public class ArrDemo4 {
    public static void main(String[] args) {
        //需求：一个数组两个引用的内存图解
        //定义arr1数组
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("=======================");
        //定义arr2数组
        int[] arr2 = arr1; //数组arr2和数组arr1共享同一份内存空间（操作的是同一个数组）
        arr2[2] = 33;
        System.out.println(arr1[2]);
        System.out.println(arr2[2]);
    }
}
