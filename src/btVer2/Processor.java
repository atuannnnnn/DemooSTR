package btVer2;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        StudentList list=new StudentList();
        Scanner sc=new Scanner(System.in);
        int luaChon;
        do{
            System.out.println("1.Them mới student");
            System.out.println("2.Cập nhật student bởi id");
            System.out.println("3. Xóa student bởi id");
            System.out.println("4. Hien thi all sinh vien");
            System.out.println("5. Tim sinh vien co diem gpa cao nhat");
            System.out.println("6. Hien thi sinh vien co hoc bong");
            System.out.println("7. Hien thi tong hoc phi cua all sinh vien");
            System.out.println("8. Ket thuc ");
            luaChon=sc.nextInt();
            sc.nextLine();
            
            switch(luaChon){
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.updateStudent();
                    break;
                case 3:
                    list.deleteStudentById();
                    break;
                case 4:
                    list.displayAllStudent();
                    break;
                case 5:
                    list.findTopStudent();
                    break;
                case 6:
                    list.findScholarshipStudents();
                    break;
                case 7:
                    System.out.println("Tong hoc phi all Sinh vien:"+ (long)list.caculateTuiitionOfAllStudents());
                    break;
                case 8:
                    System.out.println("exit");
                default:
                    System.out.println("chuong trinh khong hop le!");
            }
        }
        while(luaChon!=8);
    }
}
