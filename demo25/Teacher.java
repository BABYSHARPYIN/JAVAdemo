package cn.itcast.demo25;
//接口Smoking的实现类（子类）
public class Teacher implements Smoking{

    @Override
    public void smoke() {
        System.out.println("抽烟有害身体健康");
    }
}
