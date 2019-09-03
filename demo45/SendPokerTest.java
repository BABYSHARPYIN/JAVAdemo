package cn.itcast.demo45;
/*
需求：使用一个集合对象存储一副扑克牌，将所有扑克牌的顺序打乱，然后分发给用集合
表示的三个玩家和底牌，并打印玩家和底牌的集合内容
步骤：
    1、买一副扑克牌
        将花色和数字分别进行组合，生成所有的普通牌
        手动添加："大王"、"小王"
    2、洗牌
        使用Collections工具类的shuffle()方法打乱牌的顺序
    3、发牌
        遍历牌堆，将每一张牌分发到三个玩家集合中
        留三张作为底牌
    4、看牌
        分别打印每个玩家集合的内容
分析：
    1、创建数字数组：
        String[]nums={"3","4","5","6","7","8","9","10","J","Q","K","A","2"}
    2、创建花色数组：
        String[]colors = {"方片","梅花","红桃","黑桃"}
    3、将每一个花色分别和数字进行拼接
        colors[i].concat(nums[j]);
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendPokerTest {
    public static void main(String[] args) {
    //1、买牌
        //1.1 定义一个双列集合，键：表示牌的编号，值：表示牌的具体值 规则：编号越小，牌越小
        Map<Integer,String> pokers = new HashMap<>();
        //1.2 定义一个单列集合，用来存储所有牌的编号
        List<Integer> list = new ArrayList<>();
        //1.3 具体的买牌动作
        //普通牌，52
        String[] colors = {"♠️","♥️","♣️","♦️"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0;    //表示牌的编号
        //通过循环嵌套，造普通牌
        for (String number : numbers) { //外循环用来获取所有的点数
            for (String color : colors) {//内循环，获取所有的花色
                String poker = color+number;
                //将牌的编号，具体的牌，放到双列集合中
                pokers.put(num,poker);
                //将牌的编号放到单列集合中
                list.add(num);
                //每添加一张牌，编号要自增1
                num++;
            }
        }
        //大小王
        //添加小王
        pokers.put(num,"小王");
        list.add(num++);
        //添加大王
        pokers.put(num,"大王");
        list.add(num++);
        //打印牌
        System.out.println("所有的牌："+pokers);
        System.out.println("牌的编号："+list);
    }
}
