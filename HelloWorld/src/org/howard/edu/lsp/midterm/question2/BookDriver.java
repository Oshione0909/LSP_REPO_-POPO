package org.howard.edu.lsp.midterm.question2;

/**
 * This class tests the Book class by creating instances
 * and checking equality, as well as displaying book details.
 * 
 * It demonstrates object comparison and usage of overridden methods.
 * This is the driver class for Midterm Question 2.
 *
 * Author: Oshione Adams
 * Date: March 20, 2025
 */
public class BookDriver {
    public static void main(String[] args) {
        // Create three book instances with different values for comparison
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Compare book1 and book2: they have the same ISBN and author, so equals should return true
        System.out.println(book1.equals(book2)); // Expected Output: true

        // Compare book1 and book3: they have different ISBNs and authors, so equals should return false
        System.out.println(book1.equals(book3)); // Expected Output: false

        // Print the string representation of book1 using the overridden toString() method
        System.out.println(book1); // Expected Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}

/**
 * References:
 * - Java Object.equals documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
 * - Java String.equals documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equals-java.lang.Object-
 * - Java toString method: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#toString--
 * - Midterm exam instructions and structure provided in-class.
 */
