/*  Created by IntelliJ IDEA.
 *  User: gokul s kumar
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] bookIssued;

    public Library() {
        this.bookIssued = new Book[5];
        for (int i = 0; i < bookIssued.length; i++) {
            bookIssued[i] = new Book("Book " + (i + 1));

        }
    }


    /**
     * This method helps us to issue a new book.
     *
     * @param name The name of the book you want to issue.
     */
    public void addBookName(String name) {
        System.out.println("The book " + name + " has been issued for you.");

    }

    /**
     * This method returns the previously issued book.
     *
     * @param name The name of the book you want to be returned.
     */

    public void returnPreviousBook(String name) {
        System.out.println("Your book has been returned.");
    }

    public void list() {
        for (Book book : bookIssued) {
            System.out.println(book);
        }
    }

}