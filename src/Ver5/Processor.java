package Ver5;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList list = new PersonList();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("1. Add new Student");
            System.out.println("2. Add new Teacher");
            System.out.println("3. Update person ");
            System.out.println("4. delete person by id");
            System.out.println("5. display all  student and teacherS");
            System.out.println(" 6. find the student with the highest gpa");
            System.out.println("7. find teachers by department");
            System.out.println("8. notify whether th book's return due date has arrived or not");
            System.out.println("9. Exit");

            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.addTeacher();
                    break;
                case 3:
                    list.updatePerson();
                    break;
                case 4:
                    list.deletePersonById();
                    break;
                case 5:
                    list.displayEveryone();
                    break;
                case 6:
                    list.findTopStudent();
                    break;
                case 7:
                    list.findTeacherByDepartment();
                    break;
                case 8:
                    System.out.println("kiem tra sinh vien va giao vien da qua han hay chua:");
                    list.checkBookBorrowing();
                    break;
                case 9:
                    System.out.println("9.exit");
                default:
                    System.out.println("chuong trinh khong hop le");
            }
        } while (luaChon != 9);

    }
}
