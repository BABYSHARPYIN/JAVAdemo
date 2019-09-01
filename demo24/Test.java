package cn.itcast.demo24;
/*
    Static修饰成员方法
        静态方法：
	        静态方法中没有对象this，所以不能访问非静态成员
        静态方法的使用场景：
	        只需要访问静态成员
	        不需要访问对象状态，所需参数都由参数列表显示提供
	    需求：定义静态方法，反转数组中的元素
	    分析：
	        A：先明确定义方法的三要素
	            方法名：reverse(反转)
	            参数列表：int[]arr
	            返回值类型：void
	        B:遍历数组，交换数组索引为i和length-1 -i的元素
	        arr[i] <=> arr[arr.length-1-i]

	        C:当索引i>=(length-1-i)时，停止交换元素
	        D:在测试类中创建对象并使用

 */
public class Test {
    public static void main(String[] args) {
//    测试show方法
        ReverseArray.show();

        System.out.println("==============");
//    小需求：i 交换变量
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println("===============");
        int[] arr = {1,5,23,7,89,12};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==========");
        //调用方法，反转数组
        ReverseArray.reverse(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
