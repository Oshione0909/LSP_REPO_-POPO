package org.howard.edu.lsp.midterm.question5;

/**
 * Streamable interface defines common behaviors for all media types.
 * This ensures that all media types (Music, Movies, and Audiobooks)
 * support core playback functionalities including play, pause, and stop.
 * 
 * This interface establishes a contract that all implementing media classes
 * must follow, ensuring consistency in media playback behavior.
 * 
 * This implementation is for Midterm Question 5.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public interface Streamable {
    
    /**
     * Starts playing the media.
     */
    void play();
    
    /**
     * Pauses the media playback.
     */
    void pause();
    
    /**
     * Stops the media playback.
     */
    void stop();
}

/**
 * References:
 * - Java Interfaces documentation: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * - Java Best Practices for Interfaces: https://www.geeksforgeeks.org/interfaces-in-java/
 * - Midterm Question 5 requirements and structure based on exam instructions.
 */
