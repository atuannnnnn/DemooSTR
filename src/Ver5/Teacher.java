package Ver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;
    
    public Teacher() {
    }
    
    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateofbirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateofbirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getTeachingSubject() {
        return teachingSubject;
    }
    
    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
    
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("department:");
        String department = sc.nextLine();
        this.setDepartment(department);
        System.out.println("teachingSubject:");
        String teachingSubject = sc.nextLine();
        this.setTeachingSubject(teachingSubject);
    }

    public void updatePerson() {
        
    }

    public void displayInfo() {
        System.out.println("Hien thi thong tin giao vien:");
        System.out.println("id:" + this.getId());
        System.out.println("fullName:" + this.getFullName());
        System.out.println("department:" + this.getDepartment());
        System.out.println("teachingSubject:" + this.getTeachingSubject());
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth:" + sft.format(dateOfbirth));
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("book Borrow Date:" + sdt.format(bookBorrowDate));
        SimpleDateFormat dob = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("book Return Date:" + dob.format(bookReturnDate));        
        
    }
}
