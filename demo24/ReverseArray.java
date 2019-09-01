package cn.itcast.demo24;

public class ReverseArray {
    int num1 = 10;
    static int num2 = 20;
    public static void show(){
        //静态方法中没有对象this，所以不能访问非静态成员
//        System.out.println(this.num1);
        System.out.println(num2 );
    }
    //        定义静态方法，反转数组中的元素
public static void reverse(int[] arr){
        /*
            这里只需要完成交换元素的动作就可以了
            假设数组中的元素值为 int[] arr = {11,22,33,44,55}
            明确谁和谁交换：
                拿第一个元素和最后一个元素55交换
                拿第2个元素和倒数第二个元素44交换
                ...
                arr[i]          arr[arr.length-1-i]
            明确交换次数：
                数组的长度/2
         */
    for (int i = 0; i < arr.length/2; i++) {
//        arr[i]和arr[arr.length-1-i]进行交换
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;

        
    }

}

}
