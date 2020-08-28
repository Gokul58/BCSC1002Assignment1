/*  Created by IntelliJ IDEA.
 *  User: gokul s kumar
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;


import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ISSUED_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Library myBook = new Library();
        Student student = new Student();
        String bookName;
        do {

            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?\n");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issued book for me: ");
            System.out.println("3. Show me all my issued books for me:");
            System.out.println("4. Exit: ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("Student Detail: ");
                    student.studentDetails();
                    System.out.println("Enter the name of the book you want to issue: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.addBookName(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("enter the name of the book that you want to be returned: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myBook.returnPreviousBook(bookName);
                    break;
                case ISSUED_BOOK:
                    System.out.println("list of the books that has been issued by you.");
                    myBook.list();
                    break;
                case EXIT:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Wrong choice");

            }


        } while (studentInput != EXIT);
        scanner.close();
    }
}
