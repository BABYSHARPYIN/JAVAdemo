package cn.itcast.demo3;

public class Student {
    String name;
    private int age;

    //提供公共的访问方式，分别设置值、获取值
    //设置age的值
    public void setAge(int a){
        //在这里，对Age的值进行限定，但是不用做
        //因为从前端传过来的数据本身就是已经效验过的合法的数据
        //这里虽然可以对age的值做限定，但是
//        if (a>200||a<0){
//            //非法值
//            age = 1;
//        }else {
//            //合法值
//            age = a;
//        }
        age = a;
    }
    public int getAge(){
        return age;
    }

    //方法
    //学习
    public void study(){
        System.out.println(name+"正在努力的学习...");
    }
}
