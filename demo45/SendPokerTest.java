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

import java.util.*;

public class SendPokerTest {
    public static void main(String[] args) {
        //1、买牌
        //1.1 定义一个双列集合，键：表示牌的编号，值：表示牌的具体值 规则：编号越小，牌越小
        Map<Integer, String> pokers = new HashMap<>();
        //1.2 定义一个单列集合，用来存储所有牌的编号
        List<Integer> list = new ArrayList<>();
        //1.3 具体的买牌动作
        //普通牌，52
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int num = 0;    //表示牌的编号
        //通过循环嵌套，造普通牌
        for (String number : numbers) { //外循环用来获取所有的点数
            for (String color : colors) {//内循环，获取所有的花色
                String poker = color + number;
                //将牌的编号，具体的牌，放到双列集合中
                pokers.put(num, poker);
                //将牌的编号放到单列集合中
                list.add(num);
                //每添加一张牌，编号要自增1
                num++;
            }
        }
        //大小王
        //添加小王
        pokers.put(num, "小王");
        list.add(num++);
        //添加大王
        pokers.put(num, "大王");
        list.add(num++);
        //打印牌
        System.out.println("所有的牌：" + pokers);
        System.out.println("牌的编号：" + list);


        //2、洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后，编号为：" + list);
        //3、发牌
        //3.1 定义4个集合，分别表示3个玩家，底牌
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();//底牌

        //3.2 具体的发牌动作，将索引和3取模，决定发给谁
        for (int i = 0; i < list.size(); i++) { //根据单列的长度遍历编号
            //获取编号
            Integer pokerNum = list.get(i);
            //System.out.println(pokerNum);
            if (i >= list.size() - 3) {
                //底牌
                d.add(pokerNum);
            } else if (i % 3 == 0) {
                a.add(pokerNum);
            } else if (i % 3 == 1) {
                b.add(pokerNum);
            } else if (i % 3 == 2) {
                c.add(pokerNum);
            }

        }
        //3.3 查看玩家，底牌的编号
//        System.out.println("a:" + a);
//        System.out.println("b:" + b);
//        System.out.println("c:" + c);
//        System.out.println("底牌:" + d);
        //查看具体的牌
        System.out.println("--------------------");
//        String str = printPoker(a,pokers);
//        System.out.println("a:" + str);
        System.out.println("a:" + printPoker(a, pokers));
        System.out.println("b:" + printPoker(b, pokers));
        System.out.println("c:" + printPoker(c, pokers));
        System.out.println("底牌:" + printPoker(d, pokers));
    }

    /*
        4、定义一个方法，用来看牌
            方法名：printPoker
            参数列表：List<Integer>,Map<Integer,String>
            返回值：String
     */
    public static String printPoker(List<Integer> nums, Map<Integer, String> pokers) {
        //1、对牌的编号进行升序排列
        Collections.sort(nums);
        //2、遍历拍的编号集合，获取到每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num就是要查找的具体牌的编号
            //3、根据编号去双列集合中查找该编号对应的具体牌
            String poker = pokers.get(num);
            //4、将获取到的牌进行拼接
            sb.append(poker + " ");
        }
        //5、将最后拼接结果返回即可
        String str = sb.toString();
        return str.trim();
    }
}
