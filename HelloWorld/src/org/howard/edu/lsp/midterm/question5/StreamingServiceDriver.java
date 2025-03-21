package org.howard.edu.lsp.midterm.question5;

/**
 * StreamingServiceDriver tests the functionality of the streaming service.
 * It demonstrates the use of different media types (Music, Movies, and Audiobooks),
 * ensuring each supports core playback functions and their unique behaviors.
 * 
 * This implementation is for Midterm Question 5.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class StreamingServiceDriver {
    public static void main(String[] args) {
        // Create instances of different media types
        Streamable music = new Music("Still a Friend - Incognito");
        Streamable movie = new Movie("Avengers End Game");
        Streamable audiobook = new Audiobook("A Promised Land – Barack Obama");

        // Test common behaviors for all media types (play, pause, stop)
        System.out.println("Testing common behaviors for all media types:\n");
        
        System.out.println("Testing Music:");
        music.play();  // Expected Output: "Playing music: Still a Friend - Incognito "
        music.pause();  // Expected Output: "Paused music: Still a Friend - Incognito "
        music.stop();   // Expected Output: "Stopped music: Still a Friend - Incognito "
        System.out.println();
        
        System.out.println("Testing Movie:");
        movie.play();  // Expected Output: "Playing movie: Avengers End Game "
        movie.pause();  // Expected Output: "Paused movie: Avengers End Game "
        movie.stop();   // Expected Output: "Stopped movie: Avengers End Game "
        System.out.println();

        System.out.println("Testing Audiobook:");
        audiobook.play();  // Expected Output: "Playing audiobook: A Promised Land – Barack Obama"
        audiobook.pause();  // Expected Output: "Paused audiobook: A Promised Land – Barack Obama "
        audiobook.stop();   // Expected Output: "Stopped audiobook: A Promised Land – Barack Obama "
        System.out.println();

        // Test unique behaviors for each media type
        System.out.println("Testing unique behaviors:\n");
        
        // Test Movie-specific behavior (rewind)
        Movie movieWithRewind = (Movie) movie;  // Cast to Movie for specific method
        movieWithRewind.rewind(30);  // Expected Output: "Rewinding movie: Avengers End Game by 30 seconds"
        System.out.println();
        
        // Test Audiobook-specific behavior (setPlaybackSpeed)
        Audiobook audiobookWithSpeed = (Audiobook) audiobook;  // Cast to Audiobook for specific method
        audiobookWithSpeed.setPlaybackSpeed(1.5);  // Expected Output: "Setting playback speed of audiobook: A Promised Land – Barack Obama 1.5x"
        System.out.println();
        
        // Test Music-specific behavior (addToPlaylist)
        Music musicWithPlaylist = (Music) music;  // Cast to Music for specific method
        musicWithPlaylist.addToPlaylist("Favorites");  // Expected Output: "Added Still a Friend - Incognito to Favorites playlist"
        System.out.println();
    }
}

/**
 * References:
 * - Java Type Casting: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 * - Java Object-Oriented Programming Best Practices: https://www.geeksforgeeks.org/oops-java/
 * - Java System.out.println usage: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/print.html
 * - Midterm Question 5 expected test cases and structure based on exam instructions.
 */
