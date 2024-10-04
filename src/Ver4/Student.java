package Ver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        String id = sc.nextLine();
        this.setId(id);
        System.out.println("fullNAme:");
        String fullName = sc.nextLine();
        System.out.println("date of birth");
        String ngaySinh = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String dateOfDate = sft.format(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
        System.out.println("gpa:");
        float GPA = Float.parseFloat(sc.nextLine());
        this.setGpa(GPA);
        System.out.println("major:");
        String major = sc.nextLine();
        this.setMajor(major);

    }

    public void updatePerson() {

    }

    public void displayInfo() {
        System.out.println("Hien thi them thong tin nguoi:");
        System.out.println("id:" + this.getId());
        System.out.println("fullName:" + this.getFullName());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth:" + sft.format(dateOfBirth));
        System.out.println("gpa:" + this.gpa);
        System.out.println("major:" + this.getMajor());
    }

    @Override
    public void displaInfo() {
    }
}
