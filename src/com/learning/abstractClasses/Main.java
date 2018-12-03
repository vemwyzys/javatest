package com.learning.abstractClasses;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //新建一个老板"boss"，其奖金是10000元
        Manager boss = new Manager("nick", 200d, 2018, 2, 28);
        boss.setBonus(10000d);

        //新建三个员工
        Employee[] employees = new Employee[3];

        employees[0] = boss;
        employees[1] = new Employee("mary", 50d, 2017, 5, 30);
        employees[2] = new Employee("christina", 60d, 2018, 1, 31);

        Arrays.sort(employees);

        //输出三位员工的信息
        for (Employee e :
                employees) {
            System.out.println("name:"+e.getName()+", salary:"+e.getSalary()+" hireDay:"+e.getHireDay());
        }

    }
}