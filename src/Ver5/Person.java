
package Ver5;

import java.util.Date;

public abstract class Person implements IPerson{
    protected String id;
    protected String fullName;
    protected Date dateOfbirth;
    protected Date bookBorrowDate;
    protected Date bookReturnDate;

    public Person() {
    }

    public Person(String id, String fullName, Date dateofbirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfbirth = dateOfbirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
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

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateofbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }
    
    public abstract void addPerson();
    public abstract void updatePerson();
    public abstract void displayInfo();
    public boolean isBookOverdue(){
        long kt=bookReturnDate.getTime()-bookBorrowDate.getTime();
        long day =kt/(1000*60*60*24);
        return day>=30;
     
        
       
        
     
        
    }
    
}
