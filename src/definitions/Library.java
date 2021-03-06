/*  Created by IntelliJ IDEA.
 *  User: gokul s kumar
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] bookIssued;

    public Library() {
        this.bookIssued = new Book[5];
        for (int i = 0; i < bookIssued.length; i++) {
            bookIssued[i] = new Book("Book " + (i + 1));

        }
    }


    public Book[] getBookIssued() {
        return bookIssued;
    }

    public void setBookIssued(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Library library = (Library) o;
        return Arrays.equals(bookIssued, library.bookIssued);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bookIssued);
    }

    public Library(Book[] bookIssued) {
        this.bookIssued = bookIssued;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookIssued=" + Arrays.toString(bookIssued) +
                '}';
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