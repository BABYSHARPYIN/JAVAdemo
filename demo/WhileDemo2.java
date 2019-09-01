package cn.itcast.demo;

/**
 * 需求：求1-100之间的数据和
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 100) {
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
}
