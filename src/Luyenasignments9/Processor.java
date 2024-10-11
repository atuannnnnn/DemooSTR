package Luyenasignments9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        EMP_LIST kt = new EMP_LIST();
        Scanner sc = new Scanner(System.in);
        int nhap;
        do {
            System.out.println("1. addNew");
            System.out.println("2. update");
            System.out.println("3. delete");
            System.out.println("4. find");
            System.out.println("5.EXIT");
            nhap = sc.nextInt();
            switch (nhap) {
                case 1:
                    kt.addNew();
                    break;
                case 2:
                    kt.updateById();
                    break;
                case 3:
                    kt.deleteById();
                    break;
                case 4:
                    kt.findById();
                    break;
                case 5:
                    System.out.println("thoat khoi chuong trinh");
                default:
                    System.out.println("chuong trinh bi loi");

            }
        } while (nhap != 5);

    }
}
