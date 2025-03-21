package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

/**
 * WordProcessor class processes a sentence and returns the longest words.
 * It removes extra whitespace, processes words efficiently, and ensures
 * the longest words are returned in their order of appearance.
 * 
 * This implementation is for Midterm Question 4.
 * 
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class WordProcessor {
    // Stores the input sentence to process
    private String sentence;

    /**
     * Constructor initializes the sentence by trimming leading and trailing whitespace.
     * 
     * @param sentence The input sentence to process.
     */
    public WordProcessor(String sentence) {
        this.sentence = sentence.trim(); // Ensures no leading or trailing spaces affect processing
    }

    /**
     * Finds all longest words in the sentence.
     * The method handles varying whitespace and ensures proper word extraction.
     *
     * @return A list of longest words in order of appearance.
     */
    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>(); // Stores the longest words found
        
        // Return an empty list if the sentence is empty
        if (sentence.isEmpty()) return longestWords;
        
        // Splitting the sentence into words using whitespace as the delimiter
        String[] words = sentence.split("\\s+"); // Handles multiple spaces correctly
        int maxLength = 0; // Keeps track of the maximum word length found
        
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length(); // Update maximum length
                longestWords.clear(); // Clear previous longest words
                longestWords.add(word); // Add new longest word
            } else if (word.length() == maxLength) {
                longestWords.add(word); // Append if the word matches current max length
            }
        }
        return longestWords; // Return the list of longest words
    }
}

/**
 * References:
 * - Java List documentation: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * - Java ArrayList class reference: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * - String.split method: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-
 * - Handling whitespace in Java strings: https://www.w3schools.com/java/ref_string_trim.asp
 * - Based on Midterm Question 4 specifications and expected output from the exam instructions.
 */
