package Luyenasignments9;

import java.util.Date;
import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE {

    private double coefficients_salary;

    public EMP_FULLTIME() {
    }

    public EMP_FULLTIME(double coefficients_salary, String EmpId, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpId, EmpName, EmpDateOfBirth, StartDate);
        this.coefficients_salary = coefficients_salary;
    }

    public double getCoefficients_salary() {
        return coefficients_salary;
    }

    public void setCoefficients_salary(double coefficients_salary) {
        this.coefficients_salary = coefficients_salary;
    }

    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Coefficient Salary :");
        double coefficients_salary = Double.parseDouble(sc.nextLine());

    }

    public double CalculateAllowance() {
        int thamniem = CalculateSenioriti();
        if (thamniem >= 10) {
            return 1000000;
        } else {
            return 500000;
        }
    }

    public double CalculateSalary() {
        return BASIC_SALARY * coefficients_salary + CalculateAllowance();
    }

    public void Output() {
        super.Output();
        System.out.println("Coefficient Salary : " + coefficients_salary);
        System.out.println("CalculateSalary :" + CalculateSalary());
        System.out.println("CalculateAllowance :" + CalculateAllowance());
    }
}
