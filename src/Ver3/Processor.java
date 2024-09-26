
package Ver3;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList list=new PersonList();
        Scanner sc=new Scanner (System.in);
        int luaChon;
        do{
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person ");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find a teacher by department");
            System.out.println("9. exit");
            luaChon=sc.nextInt();
            sc.nextLine();
            switch(luaChon){
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
                    list.deletePerson();
                    break;
                case 5:
                    list.findPersonById();
                    break;
                case 6:
                    list.displayAllPerson();
                    break;
                case 7:
                    list.findTopStudent();
                    break;
                case 8:
                    list.findTeacherByDepartment();
                    break;
                case 9:
                    System.out.println("exit ");
                default:
                    System.out.println("chuong trinh khong hop le .");
                            
                    
            }
            
        }while(luaChon!=9);
        
    }
}