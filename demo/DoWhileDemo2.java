package cn.itcast.demo;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        //需求：演示三种循环的区别
        /*
            1、格式不同
            2、初始化语句不同，for循环结束后它的初始化变量无法继续使用
            3、循环体的执行次数不同 do while一定会执行一次循环体
            4、使用场景不同 for循环更倾向于循环次数固定的，dowhile循环第一次一定运行
         */
        //案例：分别通过三种循环打印1～5之间的数字
        //for循环
        for (int a =1;a<=5;a++){
            System.out.println("a:"+a);
        }
//        System.out.println(a);    //这样写不行，因为for循环执行结束后，初始化条件就不能用了
        System.out.println("-------------------------");
        //while循环
        int b = 1;
        while(b<=5){
            System.out.println("b:"+b);
            b++;
        }
        System.out.println("b-"+b);
        System.out.println("-------------------------");
        //do..while循环； 不管判断条件是否成立，循环体都会执行一次
        int c = 1;
        do {
            System.out.println("c:"+c);
            c++;
        }
        while(c<=5);
        System.out.println("c-"+c);
    }
}
