package org.howard.edu.lsp.midterm.question2;

/**
 * The Book class represents a book in a library system.
 * It contains details such as title, author, ISBN, and publication year.
 * The class provides encapsulated access to its attributes and overrides
 * equals() and toString() methods to ensure meaningful comparison and representation.
 * 
 * This implementation is for Midterm Question 2.
 * 
 * Author: [Oshione Adams]
 * Date: March 20, 2025
 * Version: 1.0
 */
public class Book {
    // Private fields to enforce encapsulation
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor initializes a new Book object with given details.
     * 
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The unique ISBN identifier for the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getter methods to access private attributes

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the year the book was published.
     * @return The publication year of the book.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Overrides the equals method to compare books by ISBN and author only.
     * This assumes two books are considered equal if they have the same ISBN and author.
     * 
     * @param obj The object to compare with.
     * @return true if the books are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check class compatibility
        Book book = (Book) obj; // Cast to Book type
        return this.ISBN.equals(book.ISBN) && this.author.equals(book.author); // Compare fields
    }

    /**
     * Overrides the toString method to return a string representation of the book.
     * Useful for printing book details to the console.
     * 
     * @return A formatted string containing book details.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

/**
 * References:
 * - Java Object.equals documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
 * - Java String.equals documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#equals-java.lang.Object-
 * - JavaDoc formatting reference: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
 * - Eclipse IDE examples from in-class demonstrations and assignment instructions.
 */