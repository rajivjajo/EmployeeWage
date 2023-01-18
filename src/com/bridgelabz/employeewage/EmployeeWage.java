package com.bridgelabz.employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 12;

    static final int PART_TIME_HOUR = 7;

    static final int WORKING_DAYS_PER_MONTH = 20;

    static final int WORKING_HOURS_PER_MONTH = 100;
        static void DaiLyWages(){
            int dayCount = 1;
            int workingHrs = 0;
            while (dayCount <= WORKING_DAYS_PER_MONTH && workingHrs < WORKING_HOURS_PER_MONTH ) {
                int employeeCheck = (int) (Math.random() * 10) % 3;
                System.out.println(employeeCheck);
                int dailyWage = 0;
                switch (employeeCheck) {
                    case 1:
                        System.out.println("Employee is Part Time");
                        dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                        workingHrs = workingHrs + PART_TIME_HOUR;
                        break;
                    case 2:
                        System.out.println("Employee is Full Time");
                        dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        workingHrs = workingHrs + FULL_DAY_HOUR;
                        break;
                    default:
                        System.out.println("Employee is Absent");
                }
                System.out.println("Daily wage of Day => " + dayCount + " is "  + dailyWage);
                System.out.println("working hrs => " + workingHrs);
                dayCount++;
            }
        }



    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");
        DaiLyWages();
    }
}
