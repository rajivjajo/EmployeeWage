package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHrPerMonth;
    private int totalEmpWage;

    public EmployeeWage(String company , int empRatePerHr , int numOfWorkingDays , int maxHrPerMonth){
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrPerMonth = maxHrPerMonth;
    }

    public void computeEmpWage(){
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
         totalEmpWage = empRatePerHr * totalEmpHrs;

    }
public String toString(){
        return "Total employee wage for "+company+" is $"+totalEmpWage;
}



    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage");
        EmployeeWage amazon = new EmployeeWage("Amazon",1050,22,176);
        EmployeeWage google = new EmployeeWage("Google",1199,21,168);
        amazon.computeEmpWage();
        System.out.println(amazon);
        google.computeEmpWage();
        System.out.println(google);
    }
}