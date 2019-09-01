package cn.itcast.demo;

/**
 * 需求：统计所有的"水仙花"的个数
 */
public class ForDemo6 {
    public static void main(String[] args) {
        int count = 0;
//     定义统计变量 count，即计数器，初始化为0
//     获取所有的三位数，即100-1000之间的数字
//     判断每一个三位数是否为水仙花数，是则count++，否则不加
        for (int i = 100; i <= 999; i++) {
            int gw = i % 10;
            int sw = i / 10 % 10;
            int bw = i / 100 % 10;
            if (gw * gw * gw + sw * sw * sw + bw * bw * bw == i) {
                //如果条件成立，则该数为水仙花数，给count++；
                count++;
            }
        }
        System.out.println(count);
    }
}
