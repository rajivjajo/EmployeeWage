package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

        static int computeEmpWage(String company , int empRatePerHr , int numOfWorkingDays , int maxHrPerMonth){
            int empHrs = 0 , totalEmpHrs = 0 , totalWorkingDays = 0;

            while (totalWorkingDays <= numOfWorkingDays && totalEmpHrs < maxHrPerMonth ) {
                totalWorkingDays++;
                int employeeCheck = (int) (Math.random() * 10) % 3;
                System.out.println(employeeCheck);
                switch (employeeCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day# " + totalWorkingDays + " Employee Hours : " + empHrs);
            }
            int totalEmpwage = empRatePerHr * totalEmpHrs;
            System.out.println("Total employee wage for "+company+" is : $"+totalEmpwage);
            return totalEmpwage;
            }




    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");
        System.out.println(computeEmpWage("Amazon",1000,21,170));
        System.out.println(computeEmpWage("Google",1199,20,165));

    }
}
