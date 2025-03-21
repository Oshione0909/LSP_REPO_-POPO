package org.howard.edu.lsp.midterm.question5;

/**
 * Audiobook class represents an audiobook that can be played, paused, and stopped.
 * It implements the Streamable interface to ensure consistent playback behavior.
 * Additionally, it provides functionality to adjust the playback speed.
 * 
 * This implementation is for Midterm Question 5.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class Audiobook implements Streamable {
    // Title of the audiobook
    private String title;
    
    /**
     * Constructor initializes an audiobook object with a title.
     * 
     * @param title The title of the audiobook.
     */
    public Audiobook(String title) {
        this.title = title;
    }
    
    /**
     * Plays the audiobook.
     */
    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }
    
    /**
     * Pauses the audiobook.
     */
    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }
    
    /**
     * Stops the audiobook.
     */
    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }
    
    /**
     * Sets the playback speed of the audiobook.
     * 
     * @param speed The speed factor to set (e.g., 1.5x for faster playback).
     */
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " to " + speed + "x");
    }
}

/**
 * References:
 * - Java Interfaces documentation: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * - Java Method Overriding: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
 * - Java Floating-Point Operations: https://www.w3schools.com/java/java_math.asp
 * - Best practices for Java class design: https://www.geeksforgeeks.org/class-in-java/
 * - Midterm Question 5 requirements and structure based on exam instructions.
 */
