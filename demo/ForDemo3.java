package cn.itcast.demo;

public class ForDemo3 {
    /**
     * 需求：计算1-5之间的数据之和
     */
    //定义一个求和变量sum，初始化值是0
    //用for循环获取1-5的数据
    //把每一次获取到的数据累加到求和变量sum
//    sum = sum + x;或者 sum+=x;
//    在控制台输出求和变量
    public static void main(String[] args) {
        int sum=0;
        for (int x=1;x<=5;x++){
            //把变量累加给sum
            sum += x;
        }
        System.out.println(sum);
    }

}
