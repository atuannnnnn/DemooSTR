package Ver4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> PersonList = new ArrayList<>();

    public PersonList() {
    }

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien can them");
        int nhap = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("nhap sinh vien can them" + (i + 1) + ":");
            Student student = new Student();
            student.addPerson();
            PersonList.add(student);
        }

    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong giao vien can them:");
        int nhap = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < nhap; i++) {
            System.out.println("nhap giao vien can them:" + (i + 1) + ":");
            Teacher teacher = new Teacher();
            teacher.addPerson();
            PersonList.add(teacher);
        }
    }

    public void updatePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id cap nhat:");
        String id = sc.nextLine();
        for (int i = 0; i < PersonList.size(); i++) {
            Person person = PersonList.get(i);
            if (person.getId().equals(id)) {
                if (person instanceof Student);
                System.out.println("cap nhat sinh vien mới:");
                Student capNhat = (Student) person;
                System.out.println("fullName moi:");
                capNhat.setFullName(sc.nextLine());
                System.out.println("GPA mới:");
                capNhat.setGpa(Float.parseFloat(sc.nextLine()));
                System.out.println("date of Birth:");
                String dob = sc.nextLine();
                SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    capNhat.setDateOfBirth(sft.parse(dob));
                } catch (Exception e) {
                    System.out.println("Wrong fomat!");
                }
                System.out.println("Major moi:");
                capNhat.setMajor(sc.nextLine());

            } else if (person instanceof Teacher);
            System.out.println("cap nhat giao vien mới :");
            Teacher capNhat = (Teacher) person;
            System.out.println("full Name moi:");
            capNhat.setFullName(sc.nextLine());
            System.out.println("date of birth:");
            String dob = sc.nextLine();
            SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");
            try {
                capNhat.setDateOfBirth(sft.parse(dob));
            } catch (Exception e) {
                System.out.println("Wrong fomat!");
            }
            System.out.println("department moi:");
            capNhat.setDeparment(sc.nextLine());
            System.out.println("teachingSubject:");
            capNhat.setTeachingSubject(sc.nextLine());
        }

    }

    public void deletePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can xoa:");
        String id = sc.nextLine();
        for (int i = 0; i < PersonList.size(); i++) {
            if (PersonList.get(i).getId().equals(id)) {
                PersonList.remove(i);
                System.out.println("nguoi co ID:" + id + "da duoc xoa");
            }
        }
    }

    public void findPersonById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can tim:");
        String id = sc.nextLine();
        for (int i = 0; i < PersonList.size(); i++) {
            Person person = PersonList.get(i);
            if (person.getId().equals(id)) {
                person.diplayInfo();
                System.out.println();
            }
        }
    }

    public void displayAllPerson() {
        for (int i = 0; i < PersonList.size(); i++) {
            Person person = PersonList.get(i);
            person.diplayInfo();
            System.out.println();
        }
    }

    public void findTopStudent() {
        Student max = (Student) PersonList.get(0);
        for (int i = 0; i < PersonList.size(); i++) {
            Student student = (Student) PersonList.get(i);
            if (student.getGpa() > max.getGpa()) {
                max = student;
            }

        }
        System.out.println("student có gpa cao nhất là:");
        max.displayInfo();

    }

    public void findTeacherByDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap department can tim");
        String department = sc.nextLine();
        for (int i = 0; i < PersonList.size(); i++) {
            Teacher teacher = (Teacher) PersonList.get(i);
            if (teacher.getDeparment().equals(department)) {
                teacher.displayInfo();
            }

        }

    }
}
