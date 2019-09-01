package cn.itcast.demo26;
//接口，USb接口
public interface USB {
    //链接
    public abstract void open();

    //断开
    public abstract void close();
}
