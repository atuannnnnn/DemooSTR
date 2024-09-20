package btapVer1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String major;

    // Constructor để khởi tạo tất cả các thuộc tính
    public Student(float GPA, String major, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    // Getters và Setters
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    

    // Phương thức thêm thông tin sinh viên
    public void addStudent() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập ID: ");
            setId(sc.nextLine());
            System.out.print("Nhập Tên: ");
            setName(sc.nextLine());
            System.out.print("Nhập Ngành: ");
            setMajor(sc.nextLine());
            System.out.print("Nhập GPA: ");
            setGPA(Float.parseFloat(sc.nextLine()));
            System.out.print("Nhập Ngày Sinh (dd/MM/yyyy): ");
            String dateOfBirthString = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date dateOfBirth = sdf.parse(dateOfBirthString);
                setDateOfBirth(dateOfBirth);
            } catch (ParseException e) {
                System.out.println("Định dạng sai!");
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("Thông Tin Của Sinh Viên:");
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("GPA: " + getGPA());
        System.out.println("Ngành: " + getMajor());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngày Sinh: " + sdf.format(getDateOfBirth()));
    }    

    private void setName(String nextLine) {
    }
}
