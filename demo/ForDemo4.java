package cn.itcast.demo;

public class ForDemo4 {
    /**
     * 需求：求出1-100之间偶数和
     */
    public static void main(String[] args) {
        //定义一个变量sum，初始化0
        int sum =0;
        //获取1-100之间的数，用for循环实现
        for (int i = 1;i<=100;i++){
            //如果条件成立，说明i是偶数，将i加入到sum中
            if (i%2==0){
                sum+=i;
            }else{
                //否则跳过这次循环执行下次循环
                continue;
            }
        }
        //判断每一个数是否为偶数，是就累加，否则不做

        //for循环结束，输出求和变量的值
        System.out.println(sum);
    }
}
