package com.learning.extendlesson;

public class Manager extends Employee{

    /**
     * 奖金
     */
    private double bonus;

    public Manager(String name, Double salary, int year, int mouth, int day) {
        super(name, salary, year, mouth, day);
        bonus = 0;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    /**
     * 覆盖工资   Manager的工资等于薪水加上奖金
     */
    @Override
    public double getSalary(){
        return super.getSalary() + bonus;
    }
}
