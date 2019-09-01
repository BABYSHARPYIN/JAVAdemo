package cn.itcast.demo21;
//子类：经理类
public class Manager extends Employee{

    public Manager() {
    }

    public Manager(String name, int salary, int id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    //奖金
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理看程序员写代码");
    }
}
