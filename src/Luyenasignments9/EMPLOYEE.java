package Luyenasignments9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class EMPLOYEE implements IEMPLOYEE {

    String EmpId;
    String EmpName;
    Date EmpDateOfBirth;
    Date StartDate;

    public EMPLOYEE() {
    }

    public EMPLOYEE(String EmpId, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EmpId :");
        String EmpId = sc.nextLine();
        System.out.println("EmpName :");
        String EmpName = sc.nextLine();

        System.out.println("EmpDateOfBirth :");
        String ngay = sc.nextLine();
        SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date EmpDateOfBirth = asd.parse(ngay);
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
        System.out.println("StartDate :");
        String nh = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date StartDate = sdf.parse(nh);
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
    }

    public void Output() {
        System.out.println("EmpId : " + EmpId);
        System.out.println("EmpName :" + EmpName);
        SimpleDateFormat asd = new SimpleDateFormat("dd/MM/yyy");
        System.out.println("EmpDateOfBirth :" + asd.format(EmpDateOfBirth));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("StartDate :" + sdf.format(StartDate));

    }

    public int CalculateSenioriti() {
        Date ngayhientai = new Date();
        long kt = StartDate.getTime() - ngayhientai.getTime();
        return (int) (kt / (1000l * 60 * 60 * 24 * 365));
    }

}
