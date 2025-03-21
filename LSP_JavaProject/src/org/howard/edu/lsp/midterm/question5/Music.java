package org.howard.edu.lsp.midterm.question5;

/**
 * Music class represents a music track that can be played, paused, and stopped.
 * It implements the Streamable interface to ensure consistent playback behavior.
 * Additionally, it provides functionality to add songs to a playlist.
 * 
 * This implementation is for Midterm Question 5.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class Music implements Streamable {
    // Title of the music track
    private String title;
    
    /**
     * Constructor initializes a music object with a title.
     * 
     * @param title The title of the music track.
     */
    public Music(String title) {
        this.title = title;
    }
    
    /**
     * Plays the music track.
     */
    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }
    
    /**
     * Pauses the music track.
     */
    @Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }
    
    /**
     * Stops the music track.
     */
    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }
    
    /**
     * Adds the music track to a specified playlist.
     * 
     * @param playlistName The name of the playlist.
     */
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}

/**
 * References:
 * - Java Interfaces documentation: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * - Java Method Overriding: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
 * - Best practices for Java class design: https://www.geeksforgeeks.org/class-in-java/
 * - Midterm Question 5 requirements and structure based on exam instructions.
 */
