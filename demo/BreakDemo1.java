package cn.itcast.demo;

/**
 * 需求：查找班级编号为3的同学，如果找到了就不在继续查找（假设班级中有15位同学）
 */
public class BreakDemo1 {
    public static void main(String[] args) {
    //遍历查找每一位同学的编号
    int number = 15;
    int count = 0;
    for(int i=0;i<=15;i++){
        System.out.println("我是编号为"+i+"的学生");
        //在循环体中，判断同学的编号是否为3
        if (i==3){
            break;
        }
    }


    //若该同学编号为3，则打印该同学编号，结束循环
}
}
