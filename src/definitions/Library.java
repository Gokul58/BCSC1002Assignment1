/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    /**
     * This method helps us to issue a new book.
     *
     * @param name The name of the book you want to issue.
     */
    public void addBookName(String name) {
        System.out.println(name + "has been issued for you.");

    }

    /**
     * This method returns the previously issued book.
     *
     * @param name The name of the book you want to be returned.
     */

    public void returnPreviousBook(String name) {
        System.out.println("Your book has been returned.");
    }

    /**
     * This method helps you to know the name of the books that has been issued by you.
     *
     * @param names The names of all the issued books.
     */

    public void myIssuedBooks(String[] names) {
        System.out.println("These are the " + names + "of the book that has been issued.");
    }


}
