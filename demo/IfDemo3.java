package cn.itcast.demo;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
        0～12 上午好
        13～18 下午好
        10～24 晚上好
        其他数字 idk
         */
        int time = 25; //测试数据时：正确数据，边界值，错误数据
        if (time>=0 && time<=12){
            System.out.println("早上好");
        }else  if (time>=13 && time<=18){
            System.out.println("下午好");
        }else  if (time>=19 && time<=24){
            System.out.println("晚上好");
        }else{
            System.out.println("idk");
        }
    }
}
