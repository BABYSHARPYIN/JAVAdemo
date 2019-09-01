package cn.itcast.demo;

/**
 * 需求：用do...while循环模拟：学完一个知识，至少练习一次
 */
public class DoWhileDemo1 {
    public static void main(String[] args) {
        //定义变量，表示练习次数
        int count = 1;
        //true表示学会了，false表示没学会,初始值为false
        boolean isOK = false;
        //在do。。while中：输入正在联系的次数，判断当练习次数不少于3时，表示已学会，每练习一次，次数自增1
        do{
            System.out.println("正在进行第"+count+"次训练");
            if (count<3){
                System.out.println("还没学会");

            }
            if (count>=3)
            {
                isOK=true;
                System.out.println("学会了");
            }
            count++;
        }while (!isOK);
    }
}
