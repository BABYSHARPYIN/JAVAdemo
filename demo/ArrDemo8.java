package cn.itcast.demo;

public class ArrDemo8 {
    public static void main(String[] args) {
        /*
        需求：定义打印数组元素的方法并调用
        分析：
            方法名：printArray
            参数列表：int[]arr
            返回值类型：void
         */
        int[] arr = {1,24,54,8,8};
         printArray(arr);
    }
    /*
    2、定义一个方法，是用来打印数组的
        明确方法名
        明确参数列表
        明确返回值类型
     */
    public static void printArray(int[] arr){    //不明确的返回值：void
        //这里显示具体的遍历代码
        for (int i = 0; i < arr.length; i++) {
            //i的最大值是arr.length-1相当于数组的最大值索引
            System.out.println(arr[i]);

        }
    }

}
