package cn.itcast.demo29;

import java.util.Objects;

//学生类
public class Student {
    //成员变量
    private int id;
    private String name;
    private int score; //成绩
    //构造方法
    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    //成员方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //toString（），用来将对象转换成对应的字符串形式

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //equals()方法，用来比较两个对象是否相同
    /*
    //自定义版的重写equals()方法，过程理解即可
    //假设id属性值相同，两个对象就是同一个对象
    public boolean equals(Object obj){//s1.equals(s2);
        *//*
        this:谁调用,this就表示谁
        obj：s2
        *//*
    Student s2 = (Student)obj; //多态的向下转型
    return this.id == s2.id;
    */

    //通过快捷键的方式生成，步骤掌握，代码理解

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                score == student.score &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
}
