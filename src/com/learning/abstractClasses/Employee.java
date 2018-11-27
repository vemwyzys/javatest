package com.learning.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    @Override
    public String getDescription() {
        return "an employee with a salary of " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(int byPercent){
        salary= salary * (1 + byPercent/100);
    }
}
