package cn.itcast.demo;

public class ForForDemo {
    public static void main(String[] args) {
        //需求：按照班级获取该班级所有的同学（假设一共有3个班级，每个班级5名同学）

        for (int i = 1; i <= 3; i++) { //外循环，用来获取每一个班级
            for (int x = 1; x <= 5; x++) { //内循环，用来获取每个班级中的学生
                System.out.println("正在打印" + i + "班级的第" + x + "名同学");
            }
            System.out.println(); //作用：i每循环一次换一行
        }
    }
}
