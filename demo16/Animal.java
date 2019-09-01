package cn.itcast.demo16;
//父类，动物类
public class Animal {
    //成员变量
    private String name;
    //构造方法
    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    //setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("吃饭");
    }

}
