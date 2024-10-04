package Ver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String deparment;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String deparment, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.deparment = deparment;
        this.teachingSubject = teachingSubject;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hien thi thong tin giao vien:");
        System.out.println("id:");
        String id = sc.nextLine();
        this.setId(id);
        System.out.println("fullName:");
        String fullName = sc.nextLine();
        this.setFullName(fullName);
        System.out.println("date of birth:");
        String ngaySinh = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String dateOfDate = sft.format(dateOfBirth);
            this.setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
        System.out.println("department:");
        String department = sc.nextLine();
        this.setDeparment(deparment);
        System.out.println("teachingSubject:");
        String teachingSubject = sc.nextLine();
        this.setTeachingSubject(teachingSubject);
    }

    public void updatePerson() {

    }

    public void displayInfo() {
        System.out.println("id:" + this.getId());
        System.out.println("fullName:" + this.getFullName());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth:" + sft.format(dateOfBirth));
        System.out.println("department:" + this.getDeparment());
        System.out.println("teachingSubject:" + this.getTeachingSubject());
    }

    @Override
    public void displaInfo() {
    }
}
