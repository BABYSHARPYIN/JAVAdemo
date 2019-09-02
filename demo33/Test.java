package cn.itcast.demo33;

/*
    Byte[] getBytes();
    将字符串转换成字节数组
    Char[] toCharArray();
    将字符串转换成字符数组
    Static String valueOf(…);
    将指定类型数据转换成字符串
    String replace(old, new);
    将指定字符（串）替换成新的字符（串）
    String[] split(String);
    切割字符串，返回切割后的字符串数据，原字符串不变
    String trim();
    去掉字符串两端的空白字符

 */
public class Test {
    public static void main(String[] args) {
        //定义一个字符串
        String s1 = "abc";

//        Byte[] getBytes(); 将字符串转换成字节数组
        byte[] bys = s1.getBytes(); //97,98,99
        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }
        System.out.println("==============");
//        Char[] toCharArray(); 将字符串转换成字符数组
        char[] chs = s1.toCharArray();//'a','b','c'
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        System.out.println("==============");
//        Static String valueOf(…); 将指定类型数据转换成字符串
        //整数123 ---》 字符串"123"
        String s2 = String.valueOf(123);
        System.out.println(s2+4);
        //在实际开发中，上述的方式基本上都会用下边的代码替代
        String s3 = ""+123;
        System.out.println(s3+4);
        System.out.println("==============");

//        String replace(old, new); 将指定字符（串）替换成新的字符（串）
        String s4 = "abc abc abc";
        //'d' 替换 'b'
        String s5 = s4.replace('b','d');
        System.out.println("s5:"+s5);
        System.out.println("==============");
//        String[] split(String); 切割字符串，返回切割后的字符串数据，原字符串不变
        //将字符串S4按照空格进行切割
        String[] arr = s4.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==============");
//        String trim(); 去掉字符串两端的空白字符
        String s6 = "  a  b  c  ";
        String s7 = s6.trim();
        System.out.println(s6);
        System.out.println(s7);
    }
}
