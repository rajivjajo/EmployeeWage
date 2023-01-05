package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=8;
    static final int PART_TIME_HOUR=4;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int emplyeeChech=(int)(Math.random()*10)%2;
        int dailyWage=0;
        if (emplyeeChech==0){
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Employee is present and daily wages are : " +dailyWage);

        }else if (emplyeeChech==1) {
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee is Part-tme and daily wages are : " +dailyWage);

        }else {
            System.out.println("Employee is absent");
        }

    }
}
