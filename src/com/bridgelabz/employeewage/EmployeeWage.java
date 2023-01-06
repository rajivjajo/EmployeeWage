package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int WORKING_DAYS_PER_MONTH = 20;


    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");

        int dayCount = 1;
        int employeeCheck = (int) (Math.random() * 10) % 3;
        System.out.println(employeeCheck);
        while (dayCount <= WORKING_DAYS_PER_MONTH ) {
            int dailyWage = 0;
            switch (employeeCheck) {
                case 1:
                    System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                case 2:
                    System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Daily wage of Day => " + dayCount + " is "  + dailyWage);
            System.out.println("Monthly wage of employee => " +(dailyWage * dayCount) );
            dayCount++;
        }
    }
}
