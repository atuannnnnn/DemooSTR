package btVer2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so luong sinh vien can them :");
        int nhap = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nhap; i++) {
            System.out.println("nhap sinh vien can them " + (i + 1) + ":");
            Student student = new Student();
            student.addStudent();
            studentList.add(student);
        }
    }
public void updateStudent(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap id sinh vien can cap nhat:");
    String id=sc.nextLine();
    
    for (int i = 0; i < studentList.size(); i++) {
        if(studentList.get(i).getId().equals(id)){
            System.out.println("cap nhat thong tin sinh vien");
            Student capNhat= new Student();
            System.out.println("fullName moi:");
            capNhat.setFullName(sc.nextLine());
            System.out.println("date of birth:");
            String dob=sc.nextLine();
            SimpleDateFormat std=new SimpleDateFormat("dd/MM/yyyy");
            try {
                capNhat.setDateOfBirth(std.parse(dob));
            } catch(Exception e){
                System.out.println("Wrong Format!");
            }
            System.out.println("GPA:");
            capNhat.setGPA((Float.parseFloat(sc.nextLine())));
            System.out.println("major:");
            capNhat.setMajor(sc.nextLine());
            studentList.set(i, capNhat);
        }
    }
} 
public void deleteStudentById(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap id can xoa:");
    String id=sc.nextLine();
    for (int i = 0; i < studentList.size(); i++) {
        if(studentList.get(i).getId().equals(id)){
            studentList.remove(i);
            System.out.println("Sinh vien id:" +id +"da bi xoa.");
        }
    }
}
public void displayAllStudent(){
    for (int i = 0; i < studentList.size(); i++) {
        Student student=studentList.get(i);
        student.displayInfo();
        System.out.println();
    }
}
public void findTopStudent(){
    Student max=studentList.get(0);
    for (int i = 0; i < studentList.size(); i++) {
        Student student=studentList.get(i);
        if(student.getGPA()>max.getGPA()){
            max=student;
        }
    }
    System.out.println("Sinh vien co GPA cao nhat:");
    max.displayInfo();
}
public ArrayList<Student>findScholarshipStudents(){
    for (int i = 0; i < studentList.size(); i++) {
        Student student=studentList.get(i);
        if(student.isSchoolarship()){
            student.displayInfo();
            System.out.println();
        }
                
    }
    return null;
}
public double caculateTuiitionOfAllStudents(){
    long hocPhi = 0;
    for (int i = 0; i < studentList.size(); i++) {
        Student student=studentList.get(i);
        hocPhi +=student.getTuiion();
    }
    return hocPhi;
}
}

