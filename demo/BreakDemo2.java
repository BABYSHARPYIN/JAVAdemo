package cn.itcast.demo;
public class BreakDemo2 {
    public static void main(String[] args) {
/**
 * 需求：程序员受邀加入A公司，现按班级查找程序员同学。现有三个班级，每班10名同学，假设第二个班级的第
 * 5位同学名叫程序员，找到该同学后则停止查找
 */

//1、通过for循环，获取到每一个班级
        lable_class:for (int i = 1; i <4 ; i++) {   //需求：外循环，获取到每个班级
            //2、在班级循环中，再次通过for循环获取到每一个学生的信息
            for (int j = 1; j <11 ; j++) {  //需求：内循环，用来获取每个学生
                //3、打印当前学生的信息
                System.out.println("正在查找第"+ i +"个班级的第"+j+"个学生");
                //4、判断当前学生是否是 程序员同学（第2个班级的第5位同学）
                if (i==2&&j==5){
                    System.out.println("success");
                    break lable_class; //break单独使用用来结束本循环，加标号结束制定循环
                }
            }

            System.out.println();
        }






//5、如果是，则结束整个循环


    }
}
