package cn.itcast.demo;

/**
 * 需求：一起来玩逢7必过小游戏
 */
public class ContinueDemo1 {
    public static void main(String[] args) {
        //使用for循环遍历1-100的数字
        for (int i = 1;i<=100;i++){
            //在循环体中判断是否包含7或是否为7的倍数
            if (i%10==7||i/10%10==7||i/100%10==7||i%7==0){
                //跳过所有含7和7的倍数的数：continue
                System.out.println("我是被跳过的数字");
                continue;
            }
            System.out.println(i);
        }
    }
}
