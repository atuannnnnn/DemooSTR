package Ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major, String id, String fullName, Date dateofbirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofbirth, bookBorrowDate, bookReturnDate);
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
        System.out.println("fullName:");
        String fullName = sc.nextLine();
        this.setFullName(fullName);
        System.out.println("gpa:");
        float GPA = Float.parseFloat(sc.nextLine());
        this.setGpa(GPA);
        System.out.println("major:");
        String major = sc.nextLine();
        this.setMajor(major);
        System.out.println("date of birth:");
        String ngaySinh = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sft.parse(ngaySinh);
            this.setDateOfbirth(dateOfBirth);

        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
        System.out.println("book Borrow Date:");
        String ngayMuon = sc.nextLine();
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookBorrowDate = sdt.parse(ngayMuon);
            this.setBookBorrowDate(bookBorrowDate);
        } catch (Exception e) {
            System.out.println("wRONG FOMAT!");
        }
        System.out.println("bookReturnDate:");
        String ngayTra = sc.nextLine();
        SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookReturnDate = dob.parse(ngayTra);
            this.setBookReturnDate(bookReturnDate);
        } catch (Exception e) {
            System.out.println("Wrong fomat!");
        }
    }

    public void updatePerson() {

    }

    public void displayInfo() {
        System.out.println("Hien thi thong tin sinh vien:");
        System.out.println("id:" + this.getId());
        System.out.println("fullName:" + this.getFullName());
        System.out.println("gpa:" + this.getGpa());
        System.out.println("major:" + this.getMajor());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth:" + sft.format(dateOfbirth));
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("book Borrow Date:" + sdt.format(bookBorrowDate));
        SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("book Return Date:" + dob.format(bookReturnDate));

    }

    void setBookReturnDate(String ngayTra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
