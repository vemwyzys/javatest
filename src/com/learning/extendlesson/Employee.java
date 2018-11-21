package com.learning.extendlesson;

import java.time.LocalDate;

public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 薪水
     */
    private double salary;
    /**
     * 雇佣日期
     */
    private LocalDate hireDay;

    public Employee(String name, Double salary, int year, int mouth, int day){
        this.name =  name;
        this.salary = salary;
        hireDay = LocalDate.of(year, mouth, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raisesalaryByPercent(int x) {
        this.salary = salary * (1 + x / 100);
    }
}
