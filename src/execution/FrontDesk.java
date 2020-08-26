/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int ISSUED_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;

        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
        System.out.println("How may I help you today?\n");
        System.out.println("1. Issue a new book for me: ");
        System.out.println("2. Return a previously issued book for me: ");
        System.out.println("3. Show me all my issued books for me:");
        System.out.println("4. Exit: ");
        studentInput = scanner.nextInt();


    }
}
