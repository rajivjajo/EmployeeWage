package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int emplyeeChech = (int) (Math.random() * 10) % 3;
        int dailyWage = 0;
        {
            switch (emplyeeChech) {
                case 1:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee is present and his daily wage is : " + dailyWage);
                    break;
                case 2: {
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part-tme and daily wages are : " + dailyWage);
                    break;
                }
                default: {
                    System.out.println("Employee is absent");
                }

            }
        }
    }
}
