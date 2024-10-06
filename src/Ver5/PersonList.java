
package Ver5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> personList=new ArrayList<>();

    public PersonList() {
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public void addStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien can them:");
        int nhap=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("So luong sinh vien can them la:");
            Student student=new Student();
            student.addPerson();
            personList.add(student);
        }
    }
    public void addTeacher(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong giao vien can them:");
        int nhap=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("so luong giao vien can nhap la:");
            Teacher teacher=new Teacher();
            teacher.addPerson();
            personList.add(teacher);
                    
        }
    }
    public void updatePerson(){
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            Person person=personList.get(i);
            if(person.getId().equals(id)){
                if(person instanceof Student){
                    System.out.println("cap Nhar:");
                    Student capNhat=(Student) person;
                    System.out.println("fullName moi:");
                    capNhat.setFullName(sc.nextLine());
                    System.out.println("gpa moi:");
                    capNhat.setGpa(Float.parseFloat(sc.nextLine()));
                    System.out.println("major:");
                    capNhat.setMajor(sc.nextLine());
                    System.out.println("date of birth:");
                    String ngaySinh=sc.nextLine();
                    SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
                    try{
                        capNhat.setDateOfbirth(sft.parse(ngaySinh));
                    }catch (Exception e){
                        System.out.println("Wrong fomat!");
                    }
                    System.out.println("date of birth:");
                    String ngayMuon=sc.nextLine();
                    SimpleDateFormat sdt=new SimpleDateFormat("dd/MM/yyyy");
                    try{
                        capNhat.setBookReturnDate(sdt.parse(ngayMuon));
                    }catch (Exception e){
                        System.out.println("Wrong fomat!");
                    }
                    System.out.println("date of birth:");
                    String ngayTra=sc.nextLine();
                    SimpleDateFormat dob=new SimpleDateFormat("dd/MM/yyyy");
                    try{
                        capNhat.setBookBorrowDate(dob.parse(ngayTra));
                    }catch (Exception e){
                        System.out.println("Wrong fomat!");
                    }
                    
                    
                }else if(person instanceof Teacher){
                    Teacher capNhat=(Teacher) person;
                    System.out.println("fullName moi:");
                    capNhat.setFullName(sc.nextLine());
                    System.out.println("department:");
                    capNhat.setDepartment(sc.nextLine());
                    System.out.println("teachingSubject moi:");
                    capNhat.setTeachingSubject(sc.nextLine());
                    System.out.println("date of birth moi:");
                    SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
                    String ngaySinh=sc.nextLine();
                    try{
                        capNhat.setDateOfbirth(sft.parse(ngaySinh));
                    }catch (Exception e){
                        System.out.println("Wrong fomat!");
                }
                        
            }
        }
                
    }
    }
    public void deletePersonById(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id nguoi can xoa:");
        String id=sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId().equals(id)){
                personList.remove(i);
                System.out.println("nguoi co id:" +id+"da xoa");
            }
        }
    }
    public void findPersonById(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap id nguoi  can tim:");
        String id=sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            Person person=personList.get(i);
            if(person.getId().equals(id)){
                person.displayInfo();
            }
                    
        }
    }
    public void displayEveryone(){
        for (int i = 0; i < personList.size(); i++) {
            Person person=personList.get(i);
            person.displayInfo();
            System.out.println();
        }
    }
    public void findTopStudent(){
        Student max=(Student) personList.get(0);
        for (int i = 0; i < personList.size(); i++) {
            Student student=(Student) personList.get(i);
            if(student.getGpa()>max.getGpa()){
                max=student;
            }
                    
        }
        System.out.println("Sinh vien co GPA cao nhat la:");
        max.displayInfo();
    }
    public Teacher findTeacherByDepartment(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap department can tim:");
        String department=sc.nextLine();
        for (int i = 0; i < personList.size(); i++) {
            Person person=personList.get(i);
            if(person instanceof Teacher){
                Teacher teacher=(Teacher) person;
                if(teacher.getDepartment().equalsIgnoreCase(department)){
                    return teacher;
                }
                        
            }
        }
        return null;
    }
    public void checkBookBorrowing(){
        for (int i = 0; i < personList.size(); i++) {
            Person person=personList.get(i);
            if(person.isBookOverdue()){
                System.out.println("nguoi co ten"+person.getFullName()+":qua han");
            }else{
                System.out.println("nguoi co ten:"+person.getFullName()+":khong qua han");
            }
        }
    }
}
