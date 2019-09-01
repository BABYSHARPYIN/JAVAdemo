package cn.itcast.demo;

/**
 * 需求：在控制台输出所有的水仙花数
 * <p>
 * 水仙花数：所谓的水仙花数是指一个三位数，其各位数字的立方和等于该
 * 数本身。
 * <p>
 * 举例：153是一个水仙花数
 * 1*1*1+5*5*5+3*3*3 = 1 + 125 + 2 =153
 */
public class ForDemo5 {
    public static void main(String[] args) {
//        获取所有的三位数
        for (int i = 100; i <= 999; i++) {
            //现在i是所有的3位数
            //获取每一个三位数的个位，十位，百位
            // 拿它们的立方和与该数本身做比较
            int gw = i % 10;
            int sw = i / 10 % 10;
            int bw = i / 100 % 10;
            if (gw*gw*gw+sw*sw*sw+bw*bw*bw==i){
                System.out.println("我是水仙花数："+i);
            }
        }


    }
}
