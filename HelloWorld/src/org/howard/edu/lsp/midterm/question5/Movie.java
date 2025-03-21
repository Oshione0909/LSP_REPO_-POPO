package org.howard.edu.lsp.midterm.question5;

/**
 * Movie class represents a movie that can be played, paused, and stopped.
 * It implements the Streamable interface to ensure consistent playback behavior.
 * Additionally, it provides functionality to rewind the movie to a specific time.
 * 
 * This implementation is for Midterm Question 5.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class Movie implements Streamable {
    // Title of the movie
    private String title;
    
    /**
     * Constructor initializes a movie object with a title.
     * 
     * @param title The title of the movie.
     */
    public Movie(String title) {
        this.title = title;
    }
    
    /**
     * Plays the movie.
     */
    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }
    
    /**
     * Pauses the movie.
     */
    @Override
    public void pause() {
        System.out.println("Paused movie: " + title);
    }
    
    /**
     * Stops the movie.
     */
    @Override
    public void stop() {
        System.out.println("Stopped movie: " + title);
    }
    
    /**
     * Rewinds the movie by a specified number of seconds.
     * 
     * @param seconds The number of seconds to rewind the movie.
     */
    public void rewind(int seconds) {
        System.out.println("Rewinding movie: " + title + " by " + seconds + " seconds");
    }
}

/**
 * References:
 * - Java Interfaces documentation: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * - Java Method Overriding: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
 * - Best practices for Java class design: https://www.geeksforgeeks.org/class-in-java/
 * - Midterm Question 5 requirements and structure based on exam instructions.
 */
