package cn.itcast.demo;

public class ArrDemo7 {
    public static void main(String[] args) {
        //需求：给定一个int型数组，找出它的最大值
        //1、定义int[]
        int[] arr = {1, 3, 5, 2, 4, 6};
        //2、定义一个临时变量temp，用来表示变量
        int temp = arr[0];
        //3、通过temp循环遍历数组，获取到每一个数据
        for (int i = 0; i < arr.length; i++) {
            //4、把获取到的数据一次和temp进行比较，并将较大的赋值给temp
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        //打印temp
        System.out.println("数组中的最大元素为："+temp);
    }
}
