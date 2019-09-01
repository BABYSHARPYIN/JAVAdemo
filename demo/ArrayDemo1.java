package cn.itcast.demo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /*
            数组的定义格式：
                格式一：
                    数组类型[] 数组名 = new 数据类型[长度];
                格式二：
                    数组类型[] 数组名 = new 数据类型{值1、值2、值3...};
                格式三：
                    数据类型[] 数组名 = {值1、值2、值3...}
         */
         //需求：定义一个长度为3的int类型的数组
                //格式一：
                int[] arr = new int[3];

                //格式二：具体存储的数字是1，2，3
                int[] arr2 =new int[]{1,2,3};

                //格式三：
                int[] arr3 = {1,2,3};

    }
}
