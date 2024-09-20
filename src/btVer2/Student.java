package btVer2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String major;
    private double tuiition;
    private boolean schoolarship;

    public Student(){
        
    }

    public Student(float GPA, String major, double tuiition, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
        this.tuiition = caculateTuiion();
        this.schoolarship = (GPA >= 9);
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
        this.tuiition = caculateTuiion();
        this.schoolarship = caculateSchoolarship();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuiion() {
        return tuiition;
    }

    public void setTuiion(double tuiion) {
        this.tuiition = tuiion;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    private boolean caculateSchoolarship() {
        return GPA >= 9.0;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID :");
        String id = sc.nextLine();
        this.setId(id);
        System.out.println("fullName :");
        String fullName = sc.nextLine();
        this.setFullName(fullName);
        System.out.println("date of Birth :");
        String ngaySinh = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sft.parse(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong Fomat !");
        }
        System.out.println("GPA :");
        float GPA = Float.parseFloat(sc.nextLine());
        this.setGPA(GPA);

        System.out.println("Major :");
        String major = sc.nextLine();
        this.setMajor(major);
    }
    public double caculateTuiion() {
        if (GPA >= 9.0) {
            return 5000000;
        } else {
            return 10000000;
        }
    }        

    public void displayInfo() {
        System.out.println("Hien Thi Thong Tin Sinh Vien :");
        System.out.println("ID :" + this.getId());
        System.out.println("FullName :" + this.getFullName());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth :" + sft.format(dateOfBirth));
        System.out.println("GPA :" + this.getGPA());
        System.out.println("Major :" + this.getMajor());
        System.out.println("tuiition :" + (long)this.getTuiion());
        System.out.print("schoolarship : ");
        if (schoolarship) {
            System.out.println("Sinh Vien Co Hoc Bong.");
        } else {
            System.out.println("Sinh Vien Khong Co Hoc Bong.");
        }
    }

}
