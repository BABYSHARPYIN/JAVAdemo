package cn.itcast.demo59;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class类
 * 成员方法：
 * public Method getMethod(String name,Class**** params)
 * 返回一个Method对象，仅公共成员方法
 * public Method getDeclareMethod(String,Class**** params)
 * 返回一个Method对象，可获取私有成员方法
 * public Method[] getMethods() 返回此类所有（不含私有）方法的数组
 * <p>
 * Method:方法类，用来表示所有的成员方法（对象）的
 * 概述：属于java
 **/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射获取Student类中的成员方法并调用
        //1、Student类的字节码文件对象
        Class clazz = Class.forName("cn.itcast.demo59.Student");
        //2、获取该类的构造器对象，然后创建Student类的对象
        Constructor con = clazz.getConstructor();
        Student stu =(Student)con.newInstance();
        //System.out.println(stu);
        //3、获取该类到的成员方法对象，然后调用此方法
        //3.1调用公共的空参方法
        Method method1 = clazz.getMethod("show1");
        System.out.println(method1);
        //打印方法名
        System.out.println(method1.getName());
        //调用此方法
        method1.invoke(stu);
        System.out.println("----------------------");
        //3.2调用一个公共的带参方法
        Method method2 = clazz.getMethod("show2", int.class);
        method2.invoke(stu,100);
        System.out.println("---------------------");
        //3.3调用私有的带参方法
        Method method3 = clazz.getDeclaredMethod("show3", int.class, int.class);
        //开启暴力反射
        method3.setAccessible(true);
        int sum = (int) method3.invoke(stu,10,20);
        System.out.println(sum);
        //3.4获取Student中所有的成员方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

}
