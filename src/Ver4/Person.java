
package Ver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson{
    protected String id;
    protected String fullName;
    protected Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void addPerson(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thong tin nguoi:");
        System.out.println("id:" );
        String id=sc.nextLine();
        this.setId(id);
        System.out.println("fullName:");
        String fullName=sc.nextLine();
        this.setFullName(fullName);
        System.out.println("date of birth:");
        String ngaySinh=sc.nextLine();
        SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfDate=sft.parse(ngaySinh);
            this.setDateOfBirth(dateOfBirth);
        }catch (Exception e){
            System.out.println("Wrong fomat!");
        }
        
    }
    public void updatePerson(){
    }
    public void diplayInfo(){
        System.out.println("Hien thi thong tin nguoi:");
        System.out.println("id:" +this.getId());
        System.out.println("fullName:" +this.getFullName());
        SimpleDateFormat sft=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date of birth:" +sft.format(dateOfBirth));
    }
}
