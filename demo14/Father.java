package cn.itcast.demo14;

/**
 * 四大权限修饰符
 *              本类:     同包下的类：     不同包下的类：  不同包下的无关类（非继承）：
 * private:      Y          N               N               N
 * 默认:          Y          Y               N               N
 * protected:    Y          Y               Y               N
 * public:       Y          Y               Y               Y
 *
 * private：强调的是给自己来使用
 * 默认：强调的是给同包下的类来使用
 * protected：强调的是给子类使用
 * public：强调的是给大家使用
 */
public class Father {
    private void show1(){
        System.out.println("show1 private");
    }
    void show2(){
        System.out.println("show2 默认");
    }
    protected void show3(){
        System.out.println("show3 protected");
    }
    public void show4(){
        System.out.println("show4 public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
