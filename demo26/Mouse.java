package cn.itcast.demo26;
//子类，鼠标类
public class Mouse implements USB,A,B{
    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标连接");
    }
}
