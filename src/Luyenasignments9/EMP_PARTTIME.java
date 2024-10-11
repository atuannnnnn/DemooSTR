package Luyenasignments9;

import java.util.Date;
import java.util.Scanner;

public class EMP_PARTTIME extends EMPLOYEE {

    private int number_of_workdays;

    public EMP_PARTTIME() {
    }

    public EMP_PARTTIME(int number_of_workdays, String EmpId, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        super(EmpId, EmpName, EmpDateOfBirth, StartDate);
        this.number_of_workdays = number_of_workdays;
    }

    public int getNumber_of_workdays() {
        return number_of_workdays;
    }

    public void setNumber_of_workdays(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("number_of_workdays :");
        int number_of_workdays = Integer.parseInt(sc.nextLine());
    }

    public double CalculateAllowance() {
        int thamniem = CalculateSenioriti();
        if (thamniem >= 10) {
            return 500000;
        } else {
            return 300000;
        }
    }

    public double CalculateSalary() {
        return BASIC_SALARY * number_of_workdays / 26 + CalculateAllowance();
    }

    public void OutPut() {
        super.Output();
        System.out.println("number_of_workdays :" + number_of_workdays);
        System.out.println("CalculateSalary :" + CalculateSalary());
        System.out.println("CalculateAllowance :" + CalculateAllowance());
    }
}
