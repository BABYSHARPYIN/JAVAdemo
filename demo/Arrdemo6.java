package cn.itcast.demo;

public class Arrdemo6 {
    public static void main(String[] args) {
        //需求：演示空指针异常
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr = null; //将数组指到null
        System.out.println(arr[0]);

    }
}
