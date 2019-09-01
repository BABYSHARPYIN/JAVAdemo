package cn.itcast.demo;

public class ArrDemo5 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] =33;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//报错，因为你访问了数组中不存在的数据

    }
}
