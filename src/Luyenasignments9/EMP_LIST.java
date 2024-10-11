package Luyenasignments9;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {

    private ArrayList<EMPLOYEE> list = new ArrayList<>();

    public EMP_LIST() {
    }

    public ArrayList<EMPLOYEE> getList() {
        return list;
    }

    public void setList(ArrayList<EMPLOYEE> list) {
        this.list = list;
    }

    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap(1:fulltime,2:pasttime)");
        int nhap = sc.nextInt();
        EMPLOYEE emp;
        if (nhap == 1) {
            emp = new EMP_FULLTIME();
        } else {
            emp = new EMP_PARTTIME();
        }
        emp.Input();
        list.add(emp);
    }

    public void updateById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap EmpId can cap nhat:");
        String EmpId = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            EMPLOYEE emp = list.get(i);
            if (emp.getEmpId().equals(EmpId)) {
                emp.Input();
                return;
            }
        }

    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap EmpId can xoa :");
        String EmpId = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmpId().equals(EmpId)) {
                list.remove(i);
                System.out.println("EmpId :" + EmpId + "da duoc xoa");
            }

        }

    }

    public void findById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap EmpId can tim :");
        String EmpId = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            EMPLOYEE emp = list.get(i);
            if (emp.getEmpId().equals(EmpId)) {
                emp.Output();
                System.out.println("salary :" + emp.CalculateSalary());
                System.out.println("allowance :" + emp.CalculateSenioriti());
                return;
            }
        }

    }
}
