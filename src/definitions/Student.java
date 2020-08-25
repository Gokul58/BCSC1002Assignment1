/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private long univRollNo;
    private int issuedBookNumbers;
    private Book[] bookIssued;

    public Student(String studentFirstName, String studentMiddleName, String studentLastName, long univRollNo, int issuedBookNumbers) {
        this.studentFirstName = studentFirstName;
        this.studentMiddleName = studentMiddleName;
        this.studentLastName = studentLastName;
        this.univRollNo = univRollNo;
        this.issuedBookNumbers = issuedBookNumbers;
    }

    public Student(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public long getUnivRollNo() {
        return univRollNo;
    }

    public void setUnivRollNo(long univRollNo) {
        this.univRollNo = univRollNo;
    }

    public int getIssuedBookNumbers() {
        return issuedBookNumbers;
    }

    public void setIssuedBookNumbers(int issuedBookNumbers) {
        this.issuedBookNumbers = issuedBookNumbers;
    }

    public Book[] getBookIssued() {
        return bookIssued.clone();
    }

    public void setBookIssued(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    @Override
    public String toString() {
        return "Student{" + "studentFirstName='" + studentFirstName + '\'' + ", studentMiddleName='" + studentMiddleName + '\'' + ", studentLastName='" + studentLastName + '\'' + ", univRollNo=" + univRollNo + ", issuedBookNumbers=" + issuedBookNumbers + ", bookIssued=" + Arrays.toString(bookIssued) + '}';
    }


}
