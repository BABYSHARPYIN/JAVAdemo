package cn.itcast.demo17;
/*
    需求：测试多态关系中，成员变量的使用

    结论：
        多态关系中，成员变量是不涉及到重写的
        简单记忆：
            多态关系中，使用成员变量，遵循"编译看做，运行也看左"
            编译看左：意思是在编译期间会看左边的成员有没有这个变量，没有就报错，有就不报错；
            运行看左：意思是在运行期间使用的是左边的类型中的这个成员
 */
public class Test {
    public static void main(String[] args) {
        //通过多态的方式创建对象，然后测试成员变量的使用
        // 多态：父类引用指向子类对象
        Animal an = new Dog();
        System.out.println(an.name); //

        //普通方式创建对象，然后测试
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}
